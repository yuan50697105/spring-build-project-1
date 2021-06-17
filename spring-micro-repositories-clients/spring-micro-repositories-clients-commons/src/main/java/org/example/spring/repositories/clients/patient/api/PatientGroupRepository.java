package org.example.spring.repositories.clients.patient.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientGroupDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientGroup;
import org.example.spring.repositories.commons.entity.patient.query.PatientGroupQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientGroupVo;

public interface PatientGroupRepository extends CommonsRepository<PatientGroup, PatientGroupVo, PatientGroupDTO, PatientGroupQuery> {
}
