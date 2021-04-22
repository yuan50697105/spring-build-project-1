package org.example.spring.models.patient.repository;

import org.example.spring.models.patient.entity.query.PatientTeamMealQuery;
import org.example.spring.models.patient.entity.result.PatientTeamMeal;
import org.example.spring.models.patient.entity.result.PatientTeamMealDetails;
import org.example.spring.models.patient.entity.vo.PatientTeamMealFormVo;
import org.example.spring.models.commons.repository.IBaseRepository;

public interface PatientTeamMealRepository extends IBaseRepository<PatientTeamMeal, PatientTeamMealFormVo, PatientTeamMealDetails, PatientTeamMealQuery> {
}
