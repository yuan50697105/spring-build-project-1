package org.example.spring.repositories.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.patient.converter.TPatientTeamConverter;
import org.example.spring.repositories.mysql.patient.converter.TPatientTeamMealConverter;
import org.example.spring.repositories.mysql.patient.dao.TPatientTeamDao;
import org.example.spring.repositories.mysql.patient.dao.TPatientTeamMealDao;
import org.example.spring.repositories.mysql.patient.repository.TPatientTeamMealRepository;
import org.example.spring.repositories.mysql.patient.repository.TPatientTeamRepository;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientTeamMealDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeam;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeamMeal;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientTeamMealVo;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientTeamVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamMealRepositoryImpl extends IBaseRepositoryImpl<TPatientTeamMeal, TPatientTeamMealDTO, TPatientTeamMealVo, TPatientTeamMealQuery, TPatientTeamMealConverter, TPatientTeamMealDao> implements TPatientTeamMealRepository {
}