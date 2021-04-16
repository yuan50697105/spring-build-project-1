package org.example.spring.models.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.models.patient.builder.PatientBuilder;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientGroupDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientMealDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientTeamDao;
import org.example.spring.models.patient.entity.query.PatientTeamQuery;
import org.example.spring.models.patient.entity.result.PatientTeam;
import org.example.spring.models.patient.entity.result.PatientTeamDetails;
import org.example.spring.models.patient.entity.vo.PatientTeamFormVo;
import org.example.spring.models.patient.entity.vo.PatientTeamVo;
import org.example.spring.models.patient.repository.PatientTeamRepository;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeam;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientTeamQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.commons.repository.impl.IBaseRepositoryImpl;
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
    private final PatientBuilder patientBuilder;
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
        PatientTeamVo group = patientTeamFormVo.getTeam();
        TPatientTeam entity = patientBuilder.buildPatientTeam(group);
        patientTeamDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(PatientTeamFormVo patientTeamFormVo) {
        Long id = patientTeamFormVo.getId();
        PatientTeamVo team = patientTeamFormVo.getTeam();
        Optional<TPatientTeam> optional = patientTeamDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TPatientTeam tPatientTeam = optional.get();
            patientBuilder.copyPatientTeam(team, tPatientTeam);
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
        return patientBuilder.buildPatientTeamResult(patientTeamDao.getById(id));
    }

    @Override
    @Cacheable(key = "'details:'+#id")
    public PatientTeamDetails getDetailsById(Long id) {
        PatientTeamDetails details = new PatientTeamDetails();
        TPatientTeam team = patientTeamDao.getById(id);
        details.setId(team.getId());
        details.setTeam(patientBuilder.buildPatientTeamResult(team));
        return details;
    }

    @Override
    public IPageData<PatientTeam> queryPage(PatientTeamQuery patientTeamQuery) {
        TPatientTeamQuery query = patientBuilder.buildPatientTeamQuery(patientTeamQuery);
        IPageData<TPatientTeam> data = patientTeamDao.queryPage(query);
        return patientBuilder.buildPatientTeamResult(data);
    }

    @Override
    public List<PatientTeam> queryList(PatientTeamQuery patientTeamQuery) {
        TPatientTeamQuery query = patientBuilder.buildPatientTeamQuery(patientTeamQuery);
        List<TPatientTeam> data = patientTeamDao.queryList(query);
        return patientBuilder.buildPatientTeamResult(data);
    }

    @Override
    public PatientTeam queryOne(PatientTeamQuery patientTeamQuery) {
        TPatientTeamQuery query = patientBuilder.buildPatientTeamQuery(patientTeamQuery);
        TPatientTeam data = patientTeamDao.queryOne(query);
        return patientBuilder.buildPatientTeamResult(data);
    }
}