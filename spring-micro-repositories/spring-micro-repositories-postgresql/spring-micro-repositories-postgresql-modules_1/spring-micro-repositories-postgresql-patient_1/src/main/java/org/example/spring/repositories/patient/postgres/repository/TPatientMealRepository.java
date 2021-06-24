package org.example.spring.repositories.patient.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientMealDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientMeal;
import org.example.spring.repositories.patient.postgres.table.query.TPatientMealQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientMealVo;

public interface TPatientMealRepository extends IBaseRepository<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery> {
}
