package org.example.spring.models.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.patient.dao.TPatientDao;
import org.example.spring.daos.mysql.patient.dao.TPatientGroupDao;
import org.example.spring.daos.mysql.patient.dao.TPatientMealDao;
import org.example.spring.daos.mysql.patient.dao.TPatientTeamDao;
import org.example.spring.daos.mysql.patient.table.po.TPatientTeam;
import org.example.spring.daos.mysql.patient.table.query.TPatientTeamQuery;
import org.example.spring.daos.mysql.patient.table.vo.TPatientTeamVo;
import org.example.spring.models.commons.repository.impl.IBaseRepositoryImpl;
import org.example.spring.models.mysql.patient.entity.query.PatientTeamQuery;
import org.example.spring.models.mysql.patient.entity.result.PatientTeam;
import org.example.spring.models.mysql.patient.entity.result.PatientTeamDetails;
import org.example.spring.models.mysql.patient.entity.vo.PatientTeamFormVo;
import org.example.spring.models.mysql.patient.repository.PatientTeamRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Repository
@AllArgsConstructor
@Transactional
public class PatientTeamRepositoryImpl extends IBaseRepositoryImpl<PatientTeam, PatientTeamFormVo, PatientTeamDetails, PatientTeamQuery> implements PatientTeamRepository {
    private final PatientModelBuilder patientModelBuilder;
    private final TPatientTeamDao patientTeamDao;
    private final TPatientGroupDao patientGroupDao;
    private final TPatientDao patientDao;
    private final TPatientMealDao patientMealDao;
    private ThreadPoolExecutor taskExecutor;

    @PostConstruct
    public void init() {
        this.taskExecutor = new ThreadPoolExecutor(2, 10, 10L, TimeUnit.SECONDS, new LinkedBlockingDeque<>(100));
    }

    @Override
    public Long saveWithId(PatientTeamFormVo patientTeamFormVo) {
        TPatientTeamVo group = patientTeamFormVo.getTeam();
        TPatientTeam entity = patientModelBuilder.buildPatientTeam(group);
        patientTeamDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(PatientTeamFormVo patientTeamFormVo) {
        Long id = patientTeamFormVo.getId();
        TPatientTeamVo team = patientTeamFormVo.getTeam();
        Optional<TPatientTeam> optional = patientTeamDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TPatientTeam tPatientTeam = optional.get();
            patientModelBuilder.copyPatientTeam(team, tPatientTeam);
            patientTeamDao.updateById(tPatientTeam);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        patientTeamDao.removeByIds(ids);
        patientGroupDao.removeByTeamIds(ids);
        patientDao.removeByTeamIds(ids);
        patientMealDao.removeByTeamIds(ids);
    }

    @Override
    public PatientTeam getById(Long id) {
        return patientModelBuilder.buildPatientTeamResult(patientTeamDao.getById(id));
    }

    @Override
    @Cacheable(key = "'details:'+#id")
    public PatientTeamDetails getDetailsById(Long id) {
        PatientTeamDetails details = new PatientTeamDetails();
        TPatientTeam team = patientTeamDao.getById(id);
        details.setTeam(patientModelBuilder.buildPatientTeamResult(team));
        return details;
    }

    @Override
    public IPageData<PatientTeam> queryPage(PatientTeamQuery patientTeamQuery) {
        TPatientTeamQuery query = patientModelBuilder.buildPatientTeamQuery(patientTeamQuery);
        IPageData<TPatientTeam> data = patientTeamDao.queryPage(query);
        return patientModelBuilder.buildPatientTeamResult(data);
    }

    @Override
    public List<PatientTeam> queryList(PatientTeamQuery patientTeamQuery) {
        TPatientTeamQuery query = patientModelBuilder.buildPatientTeamQuery(patientTeamQuery);
        List<TPatientTeam> data = patientTeamDao.queryList(query);
        return patientModelBuilder.buildPatientTeamResult(data);
    }

    @Override
    public PatientTeam queryOne(PatientTeamQuery patientTeamQuery) {
        TPatientTeamQuery query = patientModelBuilder.buildPatientTeamQuery(patientTeamQuery);
        TPatientTeam data = patientTeamDao.queryOne(query);
        return patientModelBuilder.buildPatientTeamResult(data);
    }
}