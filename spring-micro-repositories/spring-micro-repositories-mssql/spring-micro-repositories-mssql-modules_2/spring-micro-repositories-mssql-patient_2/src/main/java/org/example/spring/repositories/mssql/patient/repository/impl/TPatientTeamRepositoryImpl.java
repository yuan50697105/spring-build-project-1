package org.example.spring.repositories.mssql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mssql.patient.converter.TPatientTeamConverter;
import org.example.spring.repositories.mssql.patient.dao.TPatientTeamDao;
import org.example.spring.repositories.mssql.patient.repository.TPatientTeamRepository;
import org.example.spring.repositories.mssql.patient.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.mssql.patient.table.po.TPatientTeam;
import org.example.spring.repositories.mssql.patient.table.query.TPatientTeamQuery;
import org.example.spring.repositories.mssql.patient.table.vo.TPatientTeamVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamRepositoryImpl extends IBaseRepositoryImpl<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery, TPatientTeamConverter, TPatientTeamDao> implements TPatientTeamRepository {
}