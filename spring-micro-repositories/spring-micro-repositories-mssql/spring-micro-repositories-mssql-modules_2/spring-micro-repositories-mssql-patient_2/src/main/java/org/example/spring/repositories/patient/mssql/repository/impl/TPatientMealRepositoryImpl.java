package org.example.spring.repositories.patient.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.mssql.converter.TPatientMealConverter;
import org.example.spring.repositories.patient.mssql.dao.TPatientMealDao;
import org.example.spring.repositories.patient.mssql.repository.TPatientMealRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientMealDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientMeal;
import org.example.spring.repositories.patient.mssql.table.query.TPatientMealQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientMealVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientMealRepositoryImpl extends IBaseRepositoryImpl<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery, TPatientMealConverter, TPatientMealDao> implements TPatientMealRepository {
}