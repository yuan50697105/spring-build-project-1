package org.example.spring.infrastructures.mysql.patient.repository.patient;

import org.example.spring.infrastructures.mysql.patient.entity.query.PatientQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientDetails;
import org.example.spring.infrastructures.mysql.patient.entity.result.Patient;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

import java.util.Collection;
import java.util.List;

public interface PatientRepository extends IBaseRepository<Patient, PatientFormVo, PatientDetails, PatientQuery> {
}
