package org.example.spring.repositories.patient.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.postgres.converter.TPatientTeamMealConverter;
import org.example.spring.repositories.patient.postgres.dao.TPatientTeamMealDao;
import org.example.spring.repositories.patient.postgres.repository.TPatientTeamMealRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientTeamMeal;
import org.example.spring.repositories.patient.postgres.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientTeamMealVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery, TPatientTeamMealConverter, TPatientTeamMealDao> implements TPatientTeamMealRepository {
}