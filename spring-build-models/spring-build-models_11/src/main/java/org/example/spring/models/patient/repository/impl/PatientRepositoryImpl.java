package org.example.spring.models.patient.repository.impl;

import org.example.spring.infrastructures.mysql.patient.builder.PatientBuilder;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientGroupDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientTeamDao;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.Patient;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientFormVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientVo;
import org.example.spring.models.patient.repository.PatientRepository;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.IndexOperations;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

@Repository
@CacheConfig(cacheNames = PatientRepositoryImpl.CACHE_NAME)
public class PatientRepositoryImpl extends org.example.spring.infrastructures.mysql.patient.repository.impl.PatientRepositoryImpl implements PatientRepository {

    public static final String CACHE_NAME = "patient";
    private final TPatientTeamDao patientTeamDao;
    private final TPatientGroupDao patientGroupDao;
    private final PatientBuilder patientBuilder;
    private final TPatientDao patientDao;
    private final ThreadPoolExecutor executor;
    private final RedisCacheManager cacheManager;
    private final ElasticsearchRestTemplate elasticsearchRestTemplate;

    public PatientRepositoryImpl(TPatientTeamDao patientTeamDao,
                                 TPatientGroupDao patientGroupDao,
                                 PatientBuilder patientBuilder,
                                 TPatientDao patientDao,
                                 ThreadPoolExecutor executor, RedisCacheManager cacheManager, ElasticsearchRestTemplate elasticsearchRestTemplate) {
        super(patientTeamDao, patientGroupDao, patientBuilder, patientDao, executor);
        this.patientTeamDao = patientTeamDao;
        this.patientGroupDao = patientGroupDao;
        this.patientBuilder = patientBuilder;
        this.patientDao = patientDao;
        this.executor = executor;
        this.cacheManager = cacheManager;
        this.elasticsearchRestTemplate = elasticsearchRestTemplate;
        IndexOperations indexOperations = this.elasticsearchRestTemplate.indexOps(Patient.class);
        if (!indexOperations.exists()) {
            indexOperations.create();
        }
    }

    @Override
    public Long saveWithId(PatientFormVo patientFormVo) {
        Long id = super.saveWithId(patientFormVo);
        PatientVo patientVo = patientFormVo.getPatient();
        patientVo.setId(id);
        final Patient patient = patientBuilder.buildPatientVoToResult(patientVo);
        executor.submit(() -> putCache(id, patient));
        elasticsearchRestTemplate.save(patient);
        return id;
    }

    @Override
    public void update(PatientFormVo patientFormVo) {
        super.update(patientFormVo);
        final Long id = patientFormVo.getId();
        PatientVo patientVo = patientFormVo.getPatient();
        patientVo.setId(id);
        final Patient patient = patientBuilder.buildPatientVoToResult(patientVo);
        executor.submit(() -> putCache(id, patient));
    }

    @Override
    public void delete(List<Long> ids) {
        super.delete(ids);
        putCacheNull(ids);
    }

    @Override
    @Cacheable(key = "'details:'+#id")
    public PatientDetails getById(Long id) {
        PatientDetails details = super.getById(id);
        putCache(id, details.getPatient());
        putDetailsCache(id, details);
        return details;
    }

    @Override
    public IPageData<Patient> queryPage(PatientQuery patientQuery) {
        IPageData<Patient> data = super.queryPage(patientQuery);
        List<Patient> patients = data.getData();
        putListCache(patients);
        return data;
    }

    @Override
    public List<Patient> queryList(PatientQuery patientQuery) {
        List<Patient> patients = super.queryList(patientQuery);
        putListCache(patients);
        return patients;
    }

    @Override
    public Patient queryOne(PatientQuery patientQuery) {
        Patient patient = super.queryOne(patientQuery);
        putCache(patient);
        return patient;
    }

    @Override
    public void save(PatientFormVo formVo) {
        super.save(formVo);
    }

    @Override
    public List<Patient> queryTop(PatientQuery query, int size) {
        List<Patient> patients = super.queryTop(query, size);
        putListCache(patients);
        return patients;
    }

    @Override
    public Patient queryFirst(PatientQuery query) {
        Patient patient = super.queryFirst(query);
        putCache(patient);
        return patient;
    }

    private void putCache(Long id, Patient patient) {
        Cache cache = cacheManager.getCache(CACHE_NAME);
        cache.put(id, patient);
    }

    private void putCacheNull(final List<Long> ids) {
        executor.submit(() -> ids.forEach(id -> putCache(id, null)));
    }

    private void putDetailsCache(final Long id, final PatientDetails details) {
        Runnable runnable = () -> {
            Cache cache = cacheManager.getCache(CACHE_NAME);
            cache.put("details:" + id, details);
        };
        executor.submit(runnable);
    }

    private void putCache(final Patient patient) {
        Runnable runnable = () -> putCache(patient.getId(), patient);
        executor.submit(runnable);
    }

    private void putListCache(final List<Patient> patients) {
        Runnable runnable = () -> {
            for (Patient patient : patients) {
                putCache(patient.getId(), patient);
            }
        };
        executor.submit(runnable);
    }

    @Scheduled(fixedRateString = "5m")
    public void task() {
        queryList(new PatientQuery());
    }
}