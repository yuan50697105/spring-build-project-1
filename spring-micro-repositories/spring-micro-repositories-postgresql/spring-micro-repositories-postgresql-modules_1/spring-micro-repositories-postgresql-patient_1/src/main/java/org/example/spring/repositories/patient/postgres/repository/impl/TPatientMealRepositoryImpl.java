package org.example.spring.repositories.patient.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.postgres.converter.TPatientMealConverter;
import org.example.spring.repositories.patient.postgres.dao.TPatientMealDao;
import org.example.spring.repositories.patient.postgres.repository.TPatientMealRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientMealDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientMeal;
import org.example.spring.repositories.patient.postgres.table.query.TPatientMealQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientMealVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientMealRepositoryImpl extends IBaseRepositoryImpl<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery, TPatientMealConverter, TPatientMealDao> implements TPatientMealRepository {
}