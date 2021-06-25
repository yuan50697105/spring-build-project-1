package org.example.spring.repositories.patient.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.mysql.converter.TPatientMealConverter;
import org.example.spring.repositories.patient.mysql.dao.TPatientMealDao;
import org.example.spring.repositories.patient.mysql.repository.TPatientMealRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientMealDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientMeal;
import org.example.spring.repositories.patient.mysql.table.query.TPatientMealQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientMealVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientMealRepositoryImpl extends IBaseRepositoryImpl<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery, TPatientMealConverter, TPatientMealDao> implements TPatientMealRepository {
}