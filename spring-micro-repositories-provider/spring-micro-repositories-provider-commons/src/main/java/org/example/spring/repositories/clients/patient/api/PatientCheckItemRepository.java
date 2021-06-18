package org.example.spring.repositories.clients.patient.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.dto.PatientDTO;
import org.example.spring.repositories.commons.entity.patient.po.Patient;
import org.example.spring.repositories.commons.entity.patient.po.PatientCheckItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.query.PatientQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientCheckItemVo;
import org.example.spring.repositories.commons.entity.patient.vo.PatientVo;

public interface PatientCheckItemRepository extends CommonsRepository<PatientCheckItem, PatientCheckItemVo, PatientCheckItemDTO, PatientCheckItemQuery> {
}
