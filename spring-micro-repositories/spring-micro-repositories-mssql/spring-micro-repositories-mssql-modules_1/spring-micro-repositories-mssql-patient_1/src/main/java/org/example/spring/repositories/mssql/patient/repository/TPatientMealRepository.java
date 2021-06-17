package org.example.spring.repositories.mssql.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mssql.patient.table.dto.TPatientMealDTO;
import org.example.spring.repositories.mssql.patient.table.po.TPatientMeal;
import org.example.spring.repositories.mssql.patient.table.query.TPatientMealQuery;
import org.example.spring.repositories.mssql.patient.table.vo.TPatientMealVo;

public interface TPatientMealRepository extends IBaseRepository<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery> {
}
