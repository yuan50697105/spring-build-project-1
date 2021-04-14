package org.example.spring.infrastructures.mysql.patient.repository;

import org.example.spring.infrastructures.mysql.patient.entity.query.PatientTeamMealQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientTeamMeal;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientTeamMealDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientTeamMealFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface PatientTeamMealRepository extends IBaseRepository<PatientTeamMeal, PatientTeamMealFormVo, PatientTeamMealDetails, PatientTeamMealQuery> {
}
