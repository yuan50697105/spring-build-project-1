package org.example.spring.repositories.patient.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.mssql.converter.TPatientTeamMealConverter;
import org.example.spring.repositories.patient.mssql.dao.TPatientTeamMealDao;
import org.example.spring.repositories.patient.mssql.repository.TPatientTeamMealRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientTeamMeal;
import org.example.spring.repositories.patient.mssql.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientTeamMealVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery, TPatientTeamMealConverter, TPatientTeamMealDao> implements TPatientTeamMealRepository {
}