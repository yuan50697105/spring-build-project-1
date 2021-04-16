package org.example.spring.models.patient.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import lombok.SneakyThrows;
import org.example.spring.infrastructures.mysql.patient.dao.*;
import org.example.spring.infrastructures.mysql.patient.table.po.*;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientQuery;
import org.example.spring.models.enumerate.FeeItemType;
import org.example.spring.models.enumerate.ItemSource;
import org.example.spring.models.enumerate.PatientType;
import org.example.spring.models.patient.builder.PatientBuilder;
import org.example.spring.models.patient.entity.query.PatientQuery;
import org.example.spring.models.patient.entity.result.Patient;
import org.example.spring.models.patient.entity.result.PatientDetails;
import org.example.spring.models.patient.entity.vo.*;
import org.example.spring.models.patient.repository.PatientRepository;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.commons.repository.impl.IBaseRepositoryImpl;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ValidationException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;


@Repository
@Transactional
@CacheConfig(cacheNames = "patient")
public class PatientRepositoryImpl extends IBaseRepositoryImpl<Patient, PatientFormVo, PatientDetails, PatientQuery> implements PatientRepository {
    private final TPatientTeamDao patientTeamDao;
    private final TPatientGroupDao patientGroupDao;
    private final TPatientDao patientDao;
    private final TPatientMealDao patientMealDao;
    private final TPatientFeeItemDao patientFeeItemDao;
    private final TPatientCheckItemDao patientCheckItemDao;
    private final PatientBuilder patientBuilder;
    private final ThreadPoolExecutor executor;

    public PatientRepositoryImpl(TPatientTeamDao patientTeamDao,
                                 TPatientGroupDao patientGroupDao,
                                 TPatientMealDao patientMealDao, TPatientFeeItemDao patientFeeItemDao, PatientBuilder patientBuilder,
                                 TPatientDao patientDao,
                                 TPatientCheckItemDao patientCheckItemDao, ThreadPoolExecutor executor) {
        this.patientTeamDao = patientTeamDao;
        this.patientGroupDao = patientGroupDao;
        this.patientMealDao = patientMealDao;
        this.patientFeeItemDao = patientFeeItemDao;
        this.patientBuilder = patientBuilder;
        this.patientDao = patientDao;
        this.patientCheckItemDao = patientCheckItemDao;
        this.executor = executor;
    }

    @Override
    public Long saveWithId(final PatientFormVo patientFormVo) {
        PatientVo patient = patientFormVo.getPatient();
        final TPatient entity = patientBuilder.buildPatient(patient);
        addExtra(entity);
        patientDao.save(entity);
        if (ObjectUtil.isNotEmpty(patientFormVo.getMeal())) {
            executor.submit(() -> saveMealItem(entity, patientFormVo.getMeal()));
        }
        if (ObjectUtil.isNotEmpty(patientFormVo.getFeeItems())) {
            executor.submit(() -> {
                saveFeeItem(entity, patientFormVo.getFeeItems(), ItemSource.OPTIONAL.getValue(), FeeItemType.PERSONAL.getValue());
            });
        }
        return entity.getId();
    }

    private void saveMealItem(final TPatient entity, final PatientMealFormVo meal) {
        TPatientMeal patientMeal = patientBuilder.buildPatientMeal(meal.getMeal());
        patientMealDao.save(patientMeal);
        executor.submit(() -> saveFeeItem(entity, meal.getItems(), ItemSource.MEAL.getValue(),FeeItemType.PERSONAL.getValue()));
    }

    private void savePersonalCheckItem(PatientFeeItemFormVo feeItem, TPatientFeeItem tPatientFeeItem) {
        saveCheckItem(tPatientFeeItem, feeItem.getCheckItems(), ItemSource.OPTIONAL.getValue());
    }

    private void saveFeeItem(TPatient entity, List<PatientFeeItemFormVo> feeItems, String source, String type) {
        for (final PatientFeeItemFormVo feeItem : feeItems) {
            PatientFeeItemVo patientFeeItemVo = feeItem.getFeeItem();
            final TPatientFeeItem tPatientFeeItem = patientBuilder.buildPatientFeeItem(patientFeeItemVo);
            tPatientFeeItem.setPatientId(entity.getId());
            tPatientFeeItem.setSource(source);
            tPatientFeeItem.setType(type);
            patientFeeItemDao.save(tPatientFeeItem);
            if (ObjectUtil.isNotEmpty(feeItem.getCheckItems())) {
                executor.submit(() -> savePersonalCheckItem(feeItem, tPatientFeeItem));
            }
        }
    }

    private void saveCheckItem(TPatientFeeItem tPatientFeeItem, List<PatientCheckItemVo> checkItems, String source) {
        for (PatientCheckItemVo checkItem : checkItems) {
            TPatientCheckItem entity = patientBuilder.buildPatientCheckItem(checkItem);
            entity.setPatientId(tPatientFeeItem.getPatientId());
            entity.setFeeItemId(tPatientFeeItem.getFeeItemId());
            entity.setMealId(tPatientFeeItem.getMealId());
            entity.setSource(source);
            patientCheckItemDao.save(entity);
        }
    }

    @Override
    public void update(PatientFormVo patientFormVo) {
        Long id = patientFormVo.getId();
        PatientVo patient = patientFormVo.getPatient();
        Optional<TPatient> optional = patientDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TPatient tPatient = optional.get();
            patientBuilder.copyPatient(patient, tPatient);
            updateExtra(tPatient);
            patientDao.updateById(tPatient);
        }
    }


    @Override
    public void delete(List<Long> ids) {
        patientDao.removeByIds(ids);
    }

    @Override
    public Patient getById(Long id) {
        return patientBuilder.buildPatientResult(patientDao.getById(id));
    }

    @Override
    @Cacheable(key = "'details:'+#id")
    public PatientDetails getDetailsById(Long id) {
        PatientDetails details = new PatientDetails();
        TPatient patient = patientDao.getById(id);
        Patient patientResult = patientBuilder.buildPatientResult(patient);
        details.setPatient(patientResult);
        details.setId(patient.getId());
        return details;
    }

    @Override
    public IPageData<Patient> queryPage(PatientQuery patientQuery) {
        TPatientQuery query = patientBuilder.buildPatientQuery(patientQuery);
        IPageData<TPatient> queryPage = patientDao.queryPage(query);
        return patientBuilder.buildPatientResult(queryPage);
    }

    @Override
    public List<Patient> queryList(PatientQuery patientQuery) {
        TPatientQuery query = patientBuilder.buildPatientQuery(patientQuery);
        List<TPatient> list = patientDao.queryList(query);
        return patientBuilder.buildPatientResult(list);
    }

    @Override
    public Patient queryOne(PatientQuery patientQuery) {
        TPatientQuery query = patientBuilder.buildPatientQuery(patientQuery);
        Optional<TPatient> optional = patientDao.queryFirst(query);
        TPatient patient = optional.orElse(new Patient());
        return patientBuilder.buildPatientResult(patient);
    }

    @SneakyThrows
    private void addExtra(TPatient entity) {
        if (ObjectUtil.isNotEmpty(entity.getType()) && PatientType.get(entity.getType()).equals(PatientType.TEAM)) {
            Future<Boolean> validateGroup = executor.submit(validateGroup(entity));
            Future<Boolean> validateTeam = executor.submit(validateTeam(entity));
            Future<Optional<TPatientGroup>> group = executor.submit(getGroupOpt(entity));
            Future<Optional<TPatientTeam>> team = executor.submit(getTeamOpt(entity));
            Optional<TPatientGroup> tPatientGroup = group.get();
            Optional<TPatientTeam> tPatientTeam = team.get();
            if (validateGroup.get() && tPatientGroup.isPresent()) {
                setGroup(entity, tPatientGroup.get());
            } else {
                throw new ValidationException("分组ID不存在");
            }
            if (validateTeam.get() && tPatientTeam.isPresent()) {
                setTeam(entity, tPatientTeam.get());
            } else {
                throw new ValidationException("团队ID不存在");
            }
        }
    }

    @SneakyThrows
    private void updateExtra(TPatient entity) {
        if (ObjectUtil.isNotEmpty(entity.getType()) && PatientType.get(entity.getType()).equals(PatientType.TEAM)) {
            Future<Boolean> validateGroup = executor.submit(validateGroup(entity));
            Future<Boolean> validateTeam = executor.submit(validateTeam(entity));
            Future<Optional<TPatientGroup>> group = executor.submit(getGroupOpt(entity));
            Future<Optional<TPatientTeam>> team = executor.submit(getTeamOpt(entity));
            Optional<TPatientGroup> tPatientGroup = group.get();
            Optional<TPatientTeam> tPatientTeam = team.get();
            if (validateGroup.get() && tPatientGroup.isPresent()) {
                setGroup(entity, tPatientGroup.get());
            }
            if (validateTeam.get() && tPatientTeam.isPresent()) {
                setTeam(entity, tPatientTeam.get());
            }
        }
    }

    private Callable<Optional<TPatientTeam>> getTeamOpt(TPatient entity) {
        return () -> patientTeamDao.getByIdOpt(entity.getTeamId());
    }

    private Callable<Optional<TPatientGroup>> getGroupOpt(TPatient entity) {
        return () -> patientGroupDao.getByIdOpt(entity.getGroupId());
    }

    private Callable<Boolean> validateTeam(TPatient entity) {
        return () -> ObjectUtil.isNotEmpty(entity.getTeamId()) && patientTeamDao.existById(entity.getTeamId());
    }

    private Callable<Boolean> validateGroup(TPatient entity) {
        return () -> ObjectUtil.isNotEmpty(entity.getGroupId()) && patientGroupDao.existById(entity.getGroupId());
    }

    @SneakyThrows
    private void setTeam(TPatient entity, TPatientTeam team) {
        entity.setTeamId(team.getId());
        entity.setTeamCode(team.getCode());
        entity.setTeamName(team.getName());
    }

    @SneakyThrows
    private void setGroup(TPatient entity, TPatientGroup group) {
        entity.setGroupId(group.getId());
        entity.setGroupCode(group.getCode());
        entity.setGroupName(group.getName());
    }


}