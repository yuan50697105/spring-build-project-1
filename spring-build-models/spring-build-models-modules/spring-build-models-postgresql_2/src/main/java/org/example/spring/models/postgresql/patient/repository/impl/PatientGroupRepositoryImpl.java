package org.example.spring.models.postgresql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.postgresql.patient.dao.TPatientDao;
import org.example.spring.infrastructures.postgresql.patient.dao.TPatientGroupDao;
import org.example.spring.infrastructures.postgresql.patient.table.po.TPatientGroup;
import org.example.spring.infrastructures.postgresql.patient.table.query.TPatientGroupQuery;
import org.example.spring.infrastructures.postgresql.patient.table.vo.PatientGroupVo;
import org.example.spring.infrastructures.postgresql.patient.table.vo.PatientTeamMealVo;
import org.example.spring.models.commons.repository.impl.IBaseRepositoryImpl;
import org.example.spring.models.postgresql.patient.builder.PatientModelBuilder;
import org.example.spring.models.postgresql.patient.entity.query.PatientGroupQuery;
import org.example.spring.models.postgresql.patient.entity.result.PatientGroup;
import org.example.spring.models.postgresql.patient.entity.result.PatientGroupDetails;
import org.example.spring.models.postgresql.patient.entity.vo.PatientGroupFormVo;
import org.example.spring.models.postgresql.patient.repository.PatientGroupRepository;
import org.example.spring.plugins.commons.entity.IPageData;
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
    private final PatientModelBuilder patientModelBuilder;
    private final TPatientGroupDao patientGroupDao;
    private final TPatientDao patientDao;
    private final ThreadPoolExecutor executor;

    @Override
    public Long saveWithId(final PatientGroupFormVo patientGroupFormVo) {
        PatientGroupVo group = patientGroupFormVo.getGroup();
        TPatientGroup entity = patientModelBuilder.buildPatientGroup(group);
        setExtra(patientGroupFormVo, entity);
        patientGroupDao.save(entity);
        return entity.getId();
    }

    private void setExtra(PatientGroupFormVo patientGroupFormVo, TPatientGroup entity) {
        PatientTeamMealVo meal = patientGroupFormVo.getMeal();
        entity.setMealId(meal.getMealId());
        entity.setTeamMealId(meal.getId());
        entity.setMealName(meal.getMealName());
    }

    @Override
    public void update(PatientGroupFormVo patientGroupFormVo) {
        Long id = patientGroupFormVo.getId();
        PatientGroupVo group = patientGroupFormVo.getGroup();
        Optional<TPatientGroup> optional = patientGroupDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TPatientGroup tPatientGroup = optional.get();
            patientModelBuilder.copyPatientGroup(group, tPatientGroup);
            setExtra(patientGroupFormVo, tPatientGroup);
            patientGroupDao.updateById(tPatientGroup);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        patientDao.removeByGroupIds(ids);
        patientGroupDao.removeByIds(ids);
    }

    @Override
    public PatientGroup getById(Long id) {
        return patientModelBuilder.buildPatientGroupResult(patientGroupDao.getById(id));
    }

    @Override
    @Cacheable(key = "'details:'+#id")
    public PatientGroupDetails getDetailsById(Long id) {
        PatientGroupDetails details = new PatientGroupDetails();
        details.setGroup(patientModelBuilder.buildPatientGroupResult(patientGroupDao.getById(id)));
        return details;
    }

    @Override
    public IPageData<PatientGroup> queryPage(PatientGroupQuery patientGroupQuery) {
        TPatientGroupQuery query = patientModelBuilder.buildPatientGroupQuery(patientGroupQuery);
        IPageData<TPatientGroup> data = patientGroupDao.queryPage(query);
        return patientModelBuilder.buildPatientGroupResult(data);
    }

    @Override
    public List<PatientGroup> queryList(PatientGroupQuery patientGroupQuery) {
        TPatientGroupQuery query = patientModelBuilder.buildPatientGroupQuery(patientGroupQuery);
        List<TPatientGroup> data = patientGroupDao.queryList(query);
        return patientModelBuilder.buildPatientGroupResult(data);
    }

    @Override
    public PatientGroup queryOne(PatientGroupQuery patientGroupQuery) {
        TPatientGroupQuery query = patientModelBuilder.buildPatientGroupQuery(patientGroupQuery);
        TPatientGroup data = patientGroupDao.queryOne(query);
        return patientModelBuilder.buildPatientGroupResult(data);
    }

}