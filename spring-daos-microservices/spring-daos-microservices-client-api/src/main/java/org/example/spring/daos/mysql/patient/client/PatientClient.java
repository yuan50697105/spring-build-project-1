package org.example.spring.daos.mysql.patient.client;

import org.example.spring.daos.mysql.patient.entity.Patient;
import org.example.spring.daos.mysql.patient.entity.PatientDetails;
import org.example.spring.daos.mysql.patient.entity.PatientQuery;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;
import java.util.stream.Stream;

public interface PatientClient {
    void save(Patient patient);

    void update(Patient patient);

    void delete(Long... ids);

    void delete(List<Long> ids);

    PatientDetails getDetails(Long id);

    Patient get(Long id);

    Patient get(PatientQuery query);

    List<Patient> list(PatientQuery query);

    List<Patient> top(PatientQuery query);

    Stream<Patient> listStream(PatientQuery query);

    Stream<Patient> topStream(PatientQuery query);

    IPageData<Patient> data(PatientQuery query);
}
