package org.example.spring.repositories.patient.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientMealDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientMeal;
import org.example.spring.repositories.patient.mysql.table.query.TPatientMealQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientMealVo;

public interface TPatientMealRepository extends IBaseRepository<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery> {
}
