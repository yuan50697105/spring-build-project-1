package org.example.spring.repositories.patient.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.mysql.converter.TPatientTeamMealConverter;
import org.example.spring.repositories.patient.mysql.dao.TPatientTeamMealDao;
import org.example.spring.repositories.patient.mysql.repository.TPatientTeamMealRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientTeamMeal;
import org.example.spring.repositories.patient.mysql.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientTeamMealVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery, TPatientTeamMealConverter, TPatientTeamMealDao> implements TPatientTeamMealRepository {
}