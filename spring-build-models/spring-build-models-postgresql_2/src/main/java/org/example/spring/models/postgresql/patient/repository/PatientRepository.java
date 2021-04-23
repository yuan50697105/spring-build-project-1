package org.example.spring.models.postgresql.patient.repository;

import org.example.spring.models.commons.repository.IBaseRepository;
import org.example.spring.models.postgresql.patient.entity.query.PatientQuery;
import org.example.spring.models.postgresql.patient.entity.result.Patient;
import org.example.spring.models.postgresql.patient.entity.result.PatientDetails;
import org.example.spring.models.postgresql.patient.entity.vo.PatientFormVo;

public interface PatientRepository extends IBaseRepository<Patient, PatientFormVo, PatientDetails, PatientQuery> {
}
