package org.example.spring.daos.mysql.patient.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.patient.builder.PatientClientBuilder;
import org.example.spring.daos.mysql.patient.dao.TPatientDao;
import org.example.spring.daos.mysql.patient.entity.Patient;
import org.example.spring.daos.mysql.patient.entity.PatientDetails;
import org.example.spring.daos.mysql.patient.entity.PatientQuery;
import org.example.spring.daos.mysql.patient.table.po.TPatient;
import org.example.spring.daos.mysql.patient.table.query.TPatientQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@DubboService
@AllArgsConstructor
@Transactional
public class PatientClientImpl implements PatientClient {
    private final PatientClientBuilder patientClientBuilder;
    private final TPatientDao patientDao;

    @Override
    public void save(Patient patient) {
        TPatient entity = patientClientBuilder.build(patient);
        patientDao.save(entity);
    }

    @Override
    public void update(Patient patient) {
        Optional<TPatient> optional = patientDao.getByIdOpt(patient.getId());
        if (optional.isPresent()) {
            TPatient tPatient = optional.get();
            patientClientBuilder.copy(patient, tPatient);
            patientDao.update(tPatient);
        }
    }

    @Override
    public void delete(Long... ids) {
        delete(Arrays.asList(ids));
    }

    @Override
    public void delete(List<Long> ids) {
        patientDao.deleteByIds(ids);
    }

    @Override
    public PatientDetails getDetails(Long id) {
        PatientDetails details = new PatientDetails();
        TPatient tPatient = patientDao.getById(id);
        Patient patient = patientClientBuilder.build(tPatient);
        details.setPatient(patient);
        return details;
    }

    @Override
    public Patient get(Long id) {
        return patientClientBuilder.build(patientDao.getById(id));
    }

    @Override
    public Patient get(PatientQuery query) {
        TPatientQuery build = patientClientBuilder.build(query);
        TPatient patient = patientDao.queryFirstOpt(build).orElse(null);
        return patientClientBuilder.build(patient);
    }

    @Override
    public List<Patient> list(PatientQuery query) {
        TPatientQuery build = patientClientBuilder.build(query);
        List<TPatient> patient = patientDao.queryList(build);
        return patientClientBuilder.buildList(patient);
    }

    @Override
    public List<Patient> top(PatientQuery query) {
        TPatientQuery build = patientClientBuilder.build(query);
        List<TPatient> patient = patientDao.queryTop(build);
        return patientClientBuilder.buildList(patient);
    }

    @Override
    public Stream<Patient> listStream(PatientQuery query) {
        TPatientQuery patientQuery = patientClientBuilder.build(query);
        Stream<TPatient> stream = patientDao.queryListStream(patientQuery);
        return patientClientBuilder.build(stream);
    }

    @Override
    public Stream<Patient> topStream(PatientQuery query) {
        TPatientQuery patientQuery = patientClientBuilder.build(query);
        Stream<TPatient> stream = patientDao.queryTopStream(patientQuery);
        return patientClientBuilder.build(stream);
    }

    @Override
    public IPageData<Patient> data(PatientQuery query) {
        TPatientQuery patientQuery = patientClientBuilder.build(query);
        IPageData<TPatient> stream = patientDao.queryPage(patientQuery);
        return patientClientBuilder.buildPage(stream);
    }
}