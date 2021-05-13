package org.example.spring.models.mysql.patient.repository;

import org.example.spring.models.commons.repository.IBaseRepository;
import org.example.spring.models.mysql.patient.entity.query.PatientQuery;
import org.example.spring.models.mysql.patient.entity.result.Patient;
import org.example.spring.models.mysql.patient.entity.result.PatientDetails;
import org.example.spring.models.mysql.patient.entity.vo.PatientFormVo;

public interface PatientRepository extends IBaseRepository<Patient, PatientFormVo, PatientDetails, PatientQuery> {
}
