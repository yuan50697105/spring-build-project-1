package org.example.spring.infrastructures.mysql.patient.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import lombok.SneakyThrows;
import org.example.spring.infrastructures.mysql.patient.builder.PatientBuilder;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientGroupDao;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientTeamDao;
import org.example.spring.infrastructures.mysql.patient.entity.enumerate.PatientType;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.Patient;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientFormVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientVo;
import org.example.spring.infrastructures.mysql.patient.repository.PatientRepository;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatient;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroup;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeam;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.bind.ValidationException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Function;
import java.util.stream.Collectors;


@Repository
@Transactional
public class PatientRepositoryImpl extends IBaseRepositoryImpl<Patient, PatientFormVo, PatientDetails, PatientQuery> implements PatientRepository {
    private final TPatientTeamDao patientTeamDao;
    private final TPatientGroupDao patientGroupDao;
    private final PatientBuilder patientBuilder;
    private final TPatientDao patientDao;
    private final ThreadPoolExecutor executor;

    public PatientRepositoryImpl(TPatientTeamDao patientTeamDao,
                                 TPatientGroupDao patientGroupDao,
                                 PatientBuilder patientBuilder,
                                 TPatientDao patientDao,
                                 ThreadPoolExecutor executor) {
        this.patientTeamDao = patientTeamDao;
        this.patientGroupDao = patientGroupDao;
        this.patientBuilder = patientBuilder;
        this.patientDao = patientDao;
        this.executor = executor;
    }

    @Override
    public Long saveWithId(PatientFormVo patientFormVo) {
        PatientVo patient = patientFormVo.getPatient();
        TPatient entity = patientBuilder.buildPatient(patient);
        addExtra(entity);
        patientDao.save(entity);
        return entity.getId();
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
    public PatientDetails getById(Long id) {
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
        IPageData<Patient> data = patientBuilder.buildPatientResult(queryPage);
        Map<Long, Patient> map = data.getData().stream().collect(Collectors.toMap(Patient::getId, Function.identity()));
        return data;
    }

    @Override
    public List<Patient> queryList(PatientQuery patientQuery) {
        TPatientQuery query = patientBuilder.buildPatientQuery(patientQuery);
        List<TPatient> list = patientDao.queryList(query);
        List<Patient> patients = patientBuilder.buildPatientResult(list);
        Map<Long, Patient> map = patients.stream().collect(Collectors.toMap(Patient::getId, Function.identity()));
        return patients;
    }

    @Override
    public Patient queryOne(PatientQuery patientQuery) {
        TPatientQuery query = patientBuilder.buildPatientQuery(patientQuery);
        Optional<TPatient> queryPage = patientDao.queryFirst(query);
        TPatient patient = queryPage.orElse(new Patient());
        return patientBuilder.buildPatientResult(patient);
    }

    @SneakyThrows
    private void addExtra(TPatient entity) {
        if (PatientType.get(entity.getType()).equals(PatientType.TEAM)) {
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
        if (PatientType.get(entity.getType()).equals(PatientType.TEAM)) {
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