package org.example.spring.repositories.clients.patient.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealFeeItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMealFeeItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealFeeItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealFeeItemVo;

public interface PatientTeamMealFeeItemRepository extends CommonsRepository<PatientTeamMealFeeItem, PatientTeamMealFeeItemVo, PatientTeamMealFeeItemDTO, PatientTeamMealFeeItemQuery> {
}
