package org.example.spring.repositories.aggregation.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.aggregation.patient.converter.TPatientTeamMealConverter;
import org.example.spring.repositories.aggregation.patient.dao.TPatientTeamMealDao;
import org.example.spring.repositories.aggregation.patient.repository.TPatientTeamMealRepository;
import org.example.spring.repositories.aggregation.patient.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.aggregation.patient.table.po.TPatientTeamMeal;
import org.example.spring.repositories.aggregation.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.aggregation.patient.table.vo.TPatientTeamMealVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery, TPatientTeamMealConverter, TPatientTeamMealDao> implements TPatientTeamMealRepository {
}