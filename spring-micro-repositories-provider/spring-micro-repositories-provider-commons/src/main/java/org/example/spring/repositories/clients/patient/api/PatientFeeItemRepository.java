package org.example.spring.repositories.clients.patient.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientFeeItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientFeeItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientFeeItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientFeeItemVo;

public interface PatientFeeItemRepository extends CommonsRepository<PatientFeeItem, PatientFeeItemVo, PatientFeeItemDTO, PatientFeeItemQuery> {
}
