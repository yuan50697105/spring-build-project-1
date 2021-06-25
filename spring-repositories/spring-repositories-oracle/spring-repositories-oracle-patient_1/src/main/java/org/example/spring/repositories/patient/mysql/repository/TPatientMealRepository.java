package org.example.spring.repositories.patient.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientMealDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientMeal;
import org.example.spring.repositories.patient.oracle.table.query.TPatientMealQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientMealVo;

public interface TPatientMealRepository extends IBaseRepository<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery> {
}
