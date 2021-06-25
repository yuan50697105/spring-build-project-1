package org.example.spring.repositories.patient.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientMealDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientMeal;
import org.example.spring.repositories.patient.mssql.table.query.TPatientMealQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientMealVo;

public interface TPatientMealRepository extends IBaseRepository<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery> {
}
