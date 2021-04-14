package org.example.spring.infrastructures.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.builder.PatientBuilder;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientTeamMealDao;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientTeamMealQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientTeamMeal;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientTeamMealDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientTeamMealFormVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientTeamMealVo;
import org.example.spring.infrastructures.mysql.patient.repository.PatientTeamMealRepository;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMeal;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class PatientTeamMealRepositoryImpl extends IBaseRepositoryImpl<PatientTeamMeal, PatientTeamMealFormVo, PatientTeamMealDetails, PatientTeamMealQuery> implements PatientTeamMealRepository {
    private final PatientBuilder patientBuilder;
    private final TPatientTeamMealDao patientTeamMealDao;

    @Override
    public Long saveWithId(PatientTeamMealFormVo patientTeamMealFormVo) {
        PatientTeamMealVo meal = patientTeamMealFormVo.getMeal();
        TPatientTeamMeal patientTeamMeal = patientBuilder.buildPatientTeamMeal(meal);
        patientTeamMealDao.save(patientTeamMeal);
        return patientTeamMeal.getId();
    }

    @Override
    public void update(PatientTeamMealFormVo patientTeamMealFormVo) {
        Long id = patientTeamMealFormVo.getId();
        PatientTeamMealVo meal = patientTeamMealFormVo.getMeal();
        Optional<TPatientTeamMeal> optional = patientTeamMealDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TPatientTeamMeal patientTeamMeal = optional.get();
            patientBuilder.copyPatientTeamMeal(meal, patientTeamMeal);
            patientTeamMealDao.updateById(patientTeamMeal);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        patientTeamMealDao.removeByIds(ids);
    }

    @Override
    public PatientTeamMealDetails getById(Long id) {
        PatientTeamMealDetails details = new PatientTeamMealDetails();
        details.setMeal(patientBuilder.buildPatientTeamMealResult(patientTeamMealDao.getById(id)));
        return details;
    }

    @Override
    public IPageData<PatientTeamMeal> queryPage(PatientTeamMealQuery patientTeamMealQuery) {
        TPatientTeamMealQuery query = patientBuilder.buildPatientTeamMealQuery(patientTeamMealQuery);
        IPageData<TPatientTeamMeal> meal = patientTeamMealDao.queryPage(query);
        return patientBuilder.buildPatientTeamMealResult(meal);
    }

    @Override
    public List<PatientTeamMeal> queryList(PatientTeamMealQuery patientTeamMealQuery) {
        TPatientTeamMealQuery query = patientBuilder.buildPatientTeamMealQuery(patientTeamMealQuery);
        List<TPatientTeamMeal> meal = patientTeamMealDao.queryList(query);
        return patientBuilder.buildPatientTeamMealResult(meal);
    }

    @Override
    public PatientTeamMeal queryOne(PatientTeamMealQuery patientTeamMealQuery) {
        TPatientTeamMealQuery query = patientBuilder.buildPatientTeamMealQuery(patientTeamMealQuery);
        TPatientTeamMeal meal = patientTeamMealDao.queryFirst(query).orElse(new TPatientTeamMeal());
        return patientBuilder.buildPatientTeamMealResult(meal);
    }
}