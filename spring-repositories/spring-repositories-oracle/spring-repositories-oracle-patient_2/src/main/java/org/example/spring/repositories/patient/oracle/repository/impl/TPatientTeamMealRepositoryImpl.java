package org.example.spring.repositories.patient.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.oracle.converter.TPatientTeamMealConverter;
import org.example.spring.repositories.patient.oracle.dao.TPatientTeamMealDao;
import org.example.spring.repositories.patient.oracle.repository.TPatientTeamMealRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientTeamMeal;
import org.example.spring.repositories.patient.oracle.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientTeamMealVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery, TPatientTeamMealConverter, TPatientTeamMealDao> implements TPatientTeamMealRepository {
}