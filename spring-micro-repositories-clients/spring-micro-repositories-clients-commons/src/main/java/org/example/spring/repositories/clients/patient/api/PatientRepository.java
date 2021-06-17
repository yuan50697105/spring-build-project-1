package org.example.spring.repositories.clients.patient.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientDTO;
import org.example.spring.repositories.commons.entity.patient.po.Patient;
import org.example.spring.repositories.commons.entity.patient.query.PatientQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientVo;

public interface PatientRepository extends CommonsRepository<Patient, PatientVo, PatientDTO, PatientQuery> {
}
