package org.example.spring.repositories.oracle.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.oracle.patient.converter.TPatientMealConverter;
import org.example.spring.repositories.oracle.patient.dao.TPatientMealDao;
import org.example.spring.repositories.oracle.patient.repository.TPatientMealRepository;
import org.example.spring.repositories.oracle.patient.table.dto.TPatientMealDTO;
import org.example.spring.repositories.oracle.patient.table.po.TPatientMeal;
import org.example.spring.repositories.oracle.patient.table.query.TPatientMealQuery;
import org.example.spring.repositories.oracle.patient.table.vo.TPatientMealVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientMealRepositoryImpl extends IBaseRepositoryImpl<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery, TPatientMealConverter, TPatientMealDao> implements TPatientMealRepository {
}