package org.example.spring.repositories.patient.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.mssql.converter.TPatientTeamConverter;
import org.example.spring.repositories.patient.mssql.dao.TPatientTeamDao;
import org.example.spring.repositories.patient.mssql.repository.TPatientTeamRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientTeam;
import org.example.spring.repositories.patient.mssql.table.query.TPatientTeamQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientTeamVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamRepositoryImpl extends IBaseRepositoryImpl<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery, TPatientTeamConverter, TPatientTeamDao> implements TPatientTeamRepository {
}