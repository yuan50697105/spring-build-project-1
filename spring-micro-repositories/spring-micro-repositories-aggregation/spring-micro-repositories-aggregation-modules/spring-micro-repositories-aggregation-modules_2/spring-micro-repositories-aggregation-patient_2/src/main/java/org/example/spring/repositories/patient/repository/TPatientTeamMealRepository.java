package org.example.spring.repositories.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.patient.table.po.TPatientTeamMeal;
import org.example.spring.repositories.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.patient.table.vo.TPatientTeamMealVo;

public interface TPatientTeamMealRepository extends IBaseRepository<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery> {
}
