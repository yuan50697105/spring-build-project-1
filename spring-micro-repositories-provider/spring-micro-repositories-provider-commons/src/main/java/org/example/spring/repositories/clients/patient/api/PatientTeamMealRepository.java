package org.example.spring.repositories.clients.patient.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealDTO;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMeal;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealVo;

public interface PatientTeamMealRepository extends CommonsRepository<PatientTeamMeal, PatientTeamMealVo, PatientTeamMealDTO, PatientTeamMealQuery> {
}
