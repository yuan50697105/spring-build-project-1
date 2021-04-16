package org.example.spring.models.patient.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;
import org.example.spring.models.patient.builder.PatientBuilder;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientTeamMealCheckItemDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientTeamMealDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientTeamMealFeeItemDao;
import org.example.spring.models.patient.entity.query.PatientTeamMealQuery;
import org.example.spring.models.patient.entity.result.PatientTeamMeal;
import org.example.spring.models.patient.entity.result.PatientTeamMealDetails;
import org.example.spring.models.patient.entity.vo.*;
import org.example.spring.models.patient.repository.PatientTeamMealRepository;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMeal;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.commons.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

@Repository
@AllArgsConstructor
@Transactional
public class PatientTeamMealRepositoryImpl extends IBaseRepositoryImpl<PatientTeamMeal, PatientTeamMealFormVo, PatientTeamMealDetails, PatientTeamMealQuery> implements PatientTeamMealRepository {
    private final PatientBuilder patientBuilder;
    private final TPatientTeamMealDao patientTeamMealDao;
    private final TPatientTeamMealFeeItemDao patientTeamMealFeeItemDao;
    private final TPatientTeamMealCheckItemDao patientTeamMealCheckItemDao;
    private final ThreadPoolExecutor executor;

    @Override
    public Long saveWithId(final PatientTeamMealFormVo patientTeamMealFormVo) {
        PatientTeamMealVo meal = patientTeamMealFormVo.getMeal();
        final TPatientTeamMeal patientTeamMeal = patientBuilder.buildPatientTeamMeal(meal);
        patientTeamMealDao.save(patientTeamMeal);
        if (ObjectUtil.isNotEmpty(patientTeamMealFormVo.getFeeItems())) {
            executor.submit(() -> saveFeeItem(patientTeamMeal, patientTeamMealFormVo.getFeeItems()));
        }
        return patientTeamMeal.getId();
    }

    private void saveFeeItem(TPatientTeamMeal patientTeamMeal, List<PatientTeamMealFeeItemFormVo> feeItemFormVos) {
        if (ObjectUtil.isNotEmpty(feeItemFormVos)) {
            for (final PatientTeamMealFeeItemFormVo feeItemFormVo : feeItemFormVos) {
                PatientTeamMealFeeItemVo patientTeamMealFeeItemVo = feeItemFormVo.getFeeItem();
                final TPatientTeamMealFeeItem entity = patientBuilder.buildPatientTeamMealFeeItem(patientTeamMealFeeItemVo);
                setMealFeeItem(patientTeamMeal, entity);
                patientTeamMealFeeItemDao.save(entity);
                if (ObjectUtil.isNotEmpty(feeItemFormVo.getCheckItems())) {
                    executor.submit(() -> saveCheckItem(entity, feeItemFormVo.getCheckItems()));
                }
            }
        }
    }

    private void saveCheckItem(TPatientTeamMealFeeItem entity, List<PatientTeamMealCheckItemVo> checkItems) {
        for (PatientTeamMealCheckItemVo checkItem : checkItems) {
            TPatientTeamMealCheckItem patientTeamMealCheckItem = patientBuilder.buildPatientTeamMealCheckItem(checkItem);
            setMealCheckItem(entity, patientTeamMealCheckItem);
            patientTeamMealCheckItemDao.save(patientTeamMealCheckItem);
        }
    }

    private void setMealCheckItem(TPatientTeamMealFeeItem entity, TPatientTeamMealCheckItem patientTeamMealCheckItem) {
        patientTeamMealCheckItem.setTeamId(entity.getTeamId());
        patientTeamMealCheckItem.setMealId(entity.getMealId());
        patientTeamMealCheckItem.setTeamMealId(entity.getTeamMealId());
        patientTeamMealCheckItem.setFeeItemId(entity.getFeeItemId());
        patientTeamMealCheckItem.setTeamFeeItemId(entity.getId());
    }

    private void setMealFeeItem(TPatientTeamMeal patientTeamMeal, TPatientTeamMealFeeItem entity) {
        entity.setTeamId(patientTeamMeal.getTeamId());
        entity.setTeamMealId(patientTeamMeal.getId());
        entity.setMealId(patientTeamMeal.getMealId());
    }

    @Override
    public void update(PatientTeamMealFormVo patientTeamMealFormVo) {
//        Long id = patientTeamMealFormVo.getId();
//        PatientTeamMealVo meal = patientTeamMealFormVo.getMeal();
//        Optional<TPatientTeamMeal> optional = patientTeamMealDao.getDetailsByIdOpt(id);
//        if (optional.isPresent()) {
//            TPatientTeamMeal patientTeamMeal = optional.get();
//            patientBuilder.copyPatientTeamMeal(meal, patientTeamMeal);
//            patientTeamMealDao.updateById(patientTeamMeal);
//        }
        throw new RuntimeException("不能更新");

    }

    @Override
    public void delete(List<Long> ids) {
        patientTeamMealCheckItemDao.removeByTeamMealIds(ids);
        patientTeamMealFeeItemDao.removeByTeamMealIds(ids);
        patientTeamMealDao.removeByIds(ids);
    }

    @Override
    public PatientTeamMeal getById(Long id) {
        return patientBuilder.buildPatientTeamMealResult(patientTeamMealDao.getById(id));
    }

    @Override
    public PatientTeamMealDetails getDetailsById(Long id) {
        PatientTeamMealDetails details = new PatientTeamMealDetails();
        details.setMeal(patientBuilder.buildPatientTeamMealResult(patientTeamMealDao.getById(id)));
        details.setFeeItem(patientBuilder.buildPatientTeamMealFeeItemResult(patientTeamMealFeeItemDao.listByTeamMealId(id)));
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