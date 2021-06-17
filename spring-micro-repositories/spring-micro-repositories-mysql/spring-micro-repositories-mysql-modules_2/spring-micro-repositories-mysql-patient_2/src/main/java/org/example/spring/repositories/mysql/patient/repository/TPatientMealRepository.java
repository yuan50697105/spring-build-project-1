package org.example.spring.repositories.mysql.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientDTO;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientMealDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatient;
import org.example.spring.repositories.mysql.patient.table.po.TPatientMeal;
import org.example.spring.repositories.mysql.patient.table.query.TPatientMealQuery;
import org.example.spring.repositories.mysql.patient.table.query.TPatientQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientMealVo;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientVo;

public interface TPatientMealRepository extends IBaseRepository<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery> {
}