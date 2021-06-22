package org.example.spring.repositories.aggregation.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.aggregation.patient.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.aggregation.patient.table.po.TPatientTeamMeal;
import org.example.spring.repositories.aggregation.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.aggregation.patient.table.vo.TPatientTeamMealVo;

public interface TPatientTeamMealRepository extends IBaseRepository<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery> {
}
