package org.example.spring.models.postgresql.patient.repository;

import org.example.spring.models.commons.repository.IBaseRepository;
import org.example.spring.models.postgresql.patient.entity.query.PatientTeamMealQuery;
import org.example.spring.models.postgresql.patient.entity.result.PatientTeamMeal;
import org.example.spring.models.postgresql.patient.entity.result.PatientTeamMealDetails;
import org.example.spring.models.postgresql.patient.entity.vo.PatientTeamMealFormVo;

public interface PatientTeamMealRepository extends IBaseRepository<PatientTeamMeal, PatientTeamMealFormVo, PatientTeamMealDetails, PatientTeamMealQuery> {
}
