package org.example.spring.repositories.clients.dubbo.patient.api;

import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientDTO;
import org.example.spring.repositories.commons.entity.patient.po.Patient;
import org.example.spring.repositories.commons.entity.patient.query.PatientQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientVo;

public interface PatientDubboRepository extends CommonsDubboRepository<Patient, PatientVo, PatientDTO, PatientQuery> {
}
