package org.example.spring.repositories.patient.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.oracle.converter.TPatientMealConverter;
import org.example.spring.repositories.patient.oracle.dao.TPatientMealDao;
import org.example.spring.repositories.patient.oracle.repository.TPatientMealRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientMealDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientMeal;
import org.example.spring.repositories.patient.oracle.table.query.TPatientMealQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientMealVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientMealRepositoryImpl extends IBaseRepositoryImpl<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery, TPatientMealConverter, TPatientMealDao> implements TPatientMealRepository {
}