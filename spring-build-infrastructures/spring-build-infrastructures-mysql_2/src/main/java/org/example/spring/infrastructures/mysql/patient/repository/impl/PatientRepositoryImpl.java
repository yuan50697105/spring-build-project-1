package org.example.spring.infrastructures.mysql.patient.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;

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
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class PatientRepositoryImpl extends IBaseRepositoryImpl<Patient, PatientFormVo, PatientDetails, PatientQuery> implements PatientRepository {
    private final TPatientTeamDao patientTeamDao;
    private final TPatientGroupDao patientGroupDao;
    private final PatientBuilder patientBuilder;
    private final TPatientDao patientDao;

    @Override
    public Long saveWithId(PatientFormVo patientFormVo) {
        PatientVo patient = patientFormVo.getPatient();
        TPatient entity = patientBuilder.buildPatient(patient);
        addTeam(entity);
        addGroup(entity);
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
            updateTeam(tPatient);
            updateGroup(tPatient);
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
        details.setPatient(patientBuilder.buildPatientResult(patient));
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
        List<TPatient> queryPage = patientDao.queryList(query);
        return patientBuilder.buildPatientResult(queryPage);
    }

    @Override
    public Patient queryOne(PatientQuery patientQuery) {
        TPatientQuery query = patientBuilder.buildPatientQuery(patientQuery);
        Optional<TPatient> queryPage = patientDao.queryFirst(query);
        return patientBuilder.buildPatientResult(queryPage.orElse(new Patient()));
    }

    @SneakyThrows
    private void addTeam(TPatient entity) {
        String type = entity.getType();
        if (PatientType.get(type).equals(PatientType.TEAM)) {
            if (validateTeam(entity)) {
                setTeam(entity);
            } else {
                throw new ValidationException("分组ID不存在");
            }
        }
    }

    @SneakyThrows
    private void addGroup(TPatient entity) {
        String type = entity.getType();
        if (PatientType.get(type).equals(PatientType.TEAM)) {
            if (validateGroup(entity)) {
                setGroup(entity);
            } else {
                throw new ValidationException("分组ID不存在");
            }
        }
    }

    private void updateTeam(TPatient patient) {
        String type = patient.getType();
        if (PatientType.get(type).equals(PatientType.TEAM)) {
            if (validateTeam(patient)) {
                setTeam(patient);
            }
        }
    }

    private void updateGroup(TPatient patient) {
        String type = patient.getType();
        if (PatientType.get(type).equals(PatientType.TEAM)) {
            if (validateGroup(patient)) {
                setGroup(patient);
            }

        }
    }

    @SneakyThrows
    private boolean validateTeam(TPatient entity) {
        Long teamId = entity.getTeamId();
        return ObjectUtil.isNotEmpty(teamId) && patientTeamDao.existById(teamId);

    }

    @SneakyThrows
    private boolean validateGroup(TPatient entity) {
        Long groupId = entity.getGroupId();
        return ObjectUtil.isNotEmpty(groupId) && patientGroupDao.existById(groupId);
    }

    private void setGroup(TPatient entity) {
        Optional<TPatientGroup> optional = patientGroupDao.getByIdOpt(entity.getGroupId());
        if (optional.isPresent()) {
            TPatientGroup group = optional.get();
            entity.setGroupId(group.getId());
            entity.setGroupCode(group.getCode());
            entity.setGroupName(group.getName());
        }
    }

    private void setTeam(TPatient entity) {
        Optional<TPatientTeam> optional = patientTeamDao.getByIdOpt(entity.getTeamId());
        if (optional.isPresent()) {
            TPatientTeam team = optional.get();
            entity.setTeamId(team.getId());
            entity.setTeamCode(team.getCode());
            entity.setTeamName(team.getName());
        }
    }
}