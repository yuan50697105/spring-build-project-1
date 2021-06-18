package org.example.spring.repositories.clients.dubbo.patient.api;

import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamDTO;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeam;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMeal;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealQuery;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealVo;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamVo;

public interface PatientTeamMealDubboRepository extends CommonsDubboRepository<PatientTeamMeal, PatientTeamMealVo, PatientTeamMealDTO, PatientTeamMealQuery> {
}
