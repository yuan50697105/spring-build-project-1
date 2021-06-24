package org.example.spring.repositories.patient.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientTeamMeal;
import org.example.spring.repositories.patient.mssql.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientTeamMealVo;

public interface TPatientTeamMealRepository extends IBaseRepository<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery> {
}
