package org.example.spring.repositories.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.table.dto.TPatientMealDTO;
import org.example.spring.repositories.patient.table.po.TPatientMeal;
import org.example.spring.repositories.patient.table.query.TPatientMealQuery;
import org.example.spring.repositories.patient.table.vo.TPatientMealVo;

public interface TPatientMealRepository extends IBaseRepository<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery> {
}
