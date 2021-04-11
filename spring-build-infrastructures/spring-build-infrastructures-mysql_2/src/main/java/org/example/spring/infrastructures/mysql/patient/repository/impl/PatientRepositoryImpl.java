package org.example.spring.infrastructures.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.builder.PatientBuilder;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientDao;
import org.example.spring.infrastructures.mysql.patient.entity.query.PatientQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.Patient;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientFormVo;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientVo;
import org.example.spring.infrastructures.mysql.patient.repository.PatientRepository;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class PatientRepositoryImpl extends IBaseRepositoryImpl<Patient, PatientFormVo, PatientDetails, PatientQuery> implements PatientRepository {
    private final PatientBuilder patientBuilder;
    private final TPatientDao patientDao;

    @Override
    public Long saveWithId(PatientFormVo patientFormVo) {
        PatientVo patient = patientFormVo.getPatient();
        TPatient entity = patientBuilder.buildPatient(patient);
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
}