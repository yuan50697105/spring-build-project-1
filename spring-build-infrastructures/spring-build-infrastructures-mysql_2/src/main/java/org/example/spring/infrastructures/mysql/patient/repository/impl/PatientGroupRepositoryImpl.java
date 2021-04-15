package org.example.spring.infrastructures.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.builder.PatientBuilder;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientGroupDao;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientGroupQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroup;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroupDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupFormVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupVo;
import org.example.spring.infrastructures.mysql.patient.repository.PatientGroupRepository;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroup;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientGroupQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadPoolExecutor;

@Repository
@AllArgsConstructor
@Transactional
@CacheConfig(cacheNames = {"patient_group"})
public class PatientGroupRepositoryImpl extends IBaseRepositoryImpl<PatientGroup, PatientGroupFormVo, PatientGroupDetails, PatientGroupQuery> implements PatientGroupRepository {
    private final PatientBuilder patientBuilder;
    private final TPatientGroupDao patientGroupDao;
    private final TPatientDao patientDao;
    private final ThreadPoolExecutor executor;

    @Override
    public Long saveWithId(PatientGroupFormVo patientGroupFormVo) {
        PatientGroupVo group = patientGroupFormVo.getGroup();
        TPatientGroup entity = patientBuilder.buildPatientGroup(group);
        patientGroupDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(PatientGroupFormVo patientGroupFormVo) {
        Long id = patientGroupFormVo.getId();
        PatientGroupVo group = patientGroupFormVo.getGroup();
        Optional<TPatientGroup> optional = patientGroupDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TPatientGroup tPatientGroup = optional.get();
            patientBuilder.copyPatientGroup(group, tPatientGroup);
            patientGroupDao.updateById(tPatientGroup);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        patientGroupDao.removeByIds(ids);
        patientDao.removeByGroupIds(ids);
    }

    @Override
    @Cacheable(key = "'details:'+#id")
    public PatientGroupDetails getById(Long id) {
        PatientGroupDetails details = new PatientGroupDetails();
        details.setId(id);
        details.setGroup(patientBuilder.buildPatientGroupResult(patientGroupDao.getById(id)));
        return details;
    }

    @Override
    public IPageData<PatientGroup> queryPage(PatientGroupQuery patientGroupQuery) {
        TPatientGroupQuery query = patientBuilder.buildPatientGroupQuery(patientGroupQuery);
        IPageData<TPatientGroup> data = patientGroupDao.queryPage(query);
        return patientBuilder.buildPatientGroupResult(data);
    }

    @Override
    public List<PatientGroup> queryList(PatientGroupQuery patientGroupQuery) {
        TPatientGroupQuery query = patientBuilder.buildPatientGroupQuery(patientGroupQuery);
        List<TPatientGroup> data = patientGroupDao.queryList(query);
        return patientBuilder.buildPatientGroupResult(data);
    }

    @Override
    public PatientGroup queryOne(PatientGroupQuery patientGroupQuery) {
        TPatientGroupQuery query = patientBuilder.buildPatientGroupQuery(patientGroupQuery);
        TPatientGroup data = patientGroupDao.queryOne(query);
        return patientBuilder.buildPatientGroupResult(data);
    }

}