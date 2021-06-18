package org.example.spring.repositories.clients.dubbo.patient.api;

import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealFeeItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMealFeeItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealFeeItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealFeeItemVo;

public interface PatientTeamMealFeeItemDubboRepository extends CommonsDubboRepository<PatientTeamMealFeeItem, PatientTeamMealFeeItemVo, PatientTeamMealFeeItemDTO, PatientTeamMealFeeItemQuery> {
}
