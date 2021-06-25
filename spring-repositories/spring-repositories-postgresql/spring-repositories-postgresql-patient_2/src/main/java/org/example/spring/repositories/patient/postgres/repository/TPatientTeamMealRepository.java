package org.example.spring.repositories.patient.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientTeamMeal;
import org.example.spring.repositories.patient.postgres.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientTeamMealVo;

public interface TPatientTeamMealRepository extends IBaseRepository<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery> {
}
