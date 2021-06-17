package org.example.spring.repositories.postgres.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.postgres.patient.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.postgres.patient.table.po.TPatientTeamMeal;
import org.example.spring.repositories.postgres.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.postgres.patient.table.vo.TPatientTeamMealVo;

public interface TPatientTeamMealRepository extends IBaseRepository<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery> {
}
