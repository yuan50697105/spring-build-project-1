package org.example.spring.repositories.feign.patient.clients;


import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamDTO;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeam;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMeal;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealQuery;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealVo;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("patient/team/meal/repository/client")
public interface PatientTeamMealRepositoryClient extends CommonsFeignClient<PatientTeamMeal, PatientTeamMealVo, PatientTeamMealDTO, PatientTeamMealQuery> {

}
