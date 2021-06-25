package org.example.spring.repositories.feign.patient.clients;


import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMealCheckItem;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealCheckItemVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("patient/team/meal/check/item/repository/client")
public interface PatientTeamMealCheckItemRepositoryClient extends CommonsFeignClient<PatientTeamMealCheckItem, PatientTeamMealCheckItemVo, PatientTeamMealCheckItemDTO, PatientTeamMealCheckItemQuery> {

}
