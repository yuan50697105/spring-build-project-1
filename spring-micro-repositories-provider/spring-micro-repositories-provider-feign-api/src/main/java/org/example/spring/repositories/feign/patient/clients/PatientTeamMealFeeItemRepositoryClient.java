package org.example.spring.repositories.feign.patient.clients;


import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealFeeItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMealCheckItem;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMealFeeItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealFeeItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealCheckItemVo;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealFeeItemVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("patient/team/meal/fee/item/repository/client")
public interface PatientTeamMealFeeItemRepositoryClient extends CommonsFeignClient<PatientTeamMealFeeItem, PatientTeamMealFeeItemVo, PatientTeamMealFeeItemDTO, PatientTeamMealFeeItemQuery> {

}
