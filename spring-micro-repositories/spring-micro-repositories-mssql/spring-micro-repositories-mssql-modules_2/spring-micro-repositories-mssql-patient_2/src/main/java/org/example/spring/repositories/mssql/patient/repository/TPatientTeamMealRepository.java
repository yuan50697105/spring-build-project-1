package org.example.spring.repositories.mssql.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mssql.patient.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.mssql.patient.table.po.TPatientTeamMeal;
import org.example.spring.repositories.mssql.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.mssql.patient.table.vo.TPatientTeamMealVo;

public interface TPatientTeamMealRepository extends IBaseRepository<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery> {
}
