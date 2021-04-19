package org.example.spring.models.patient.repository;

import org.example.spring.models.patient.entity.query.PatientQuery;
import org.example.spring.models.patient.entity.result.PatientDetails;
import org.example.spring.models.patient.entity.result.Patient;
import org.example.spring.models.patient.entity.vo.PatientFormVo;
import org.example.spring.plugins.commons.repository.IBaseRepository;

import java.util.List;

public interface PatientRepository extends IBaseRepository<Patient, PatientFormVo, PatientDetails, PatientQuery> {
}
