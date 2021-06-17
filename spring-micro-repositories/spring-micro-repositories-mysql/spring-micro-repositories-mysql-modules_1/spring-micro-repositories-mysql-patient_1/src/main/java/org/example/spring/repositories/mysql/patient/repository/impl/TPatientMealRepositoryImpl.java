package org.example.spring.repositories.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.patient.converter.TPatientConverter;
import org.example.spring.repositories.mysql.patient.converter.TPatientMealConverter;
import org.example.spring.repositories.mysql.patient.dao.TPatientDao;
import org.example.spring.repositories.mysql.patient.dao.TPatientMealDao;
import org.example.spring.repositories.mysql.patient.repository.TPatientMealRepository;
import org.example.spring.repositories.mysql.patient.repository.TPatientRepository;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientDTO;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientMealDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatient;
import org.example.spring.repositories.mysql.patient.table.po.TPatientMeal;
import org.example.spring.repositories.mysql.patient.table.query.TPatientMealQuery;
import org.example.spring.repositories.mysql.patient.table.query.TPatientQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientMealVo;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientMealRepositoryImpl extends IBaseRepositoryImpl<TPatientMeal, TPatientMealDTO, TPatientMealVo, TPatientMealQuery, TPatientMealConverter, TPatientMealDao> implements TPatientMealRepository {
}