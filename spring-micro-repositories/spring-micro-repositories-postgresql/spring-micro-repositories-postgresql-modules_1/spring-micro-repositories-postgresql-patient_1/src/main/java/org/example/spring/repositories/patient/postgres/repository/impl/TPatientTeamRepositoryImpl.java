package org.example.spring.repositories.patient.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.postgres.converter.TPatientTeamConverter;
import org.example.spring.repositories.patient.postgres.dao.TPatientTeamDao;
import org.example.spring.repositories.patient.postgres.repository.TPatientTeamRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientTeam;
import org.example.spring.repositories.patient.postgres.table.query.TPatientTeamQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientTeamVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamRepositoryImpl extends IBaseRepositoryImpl<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery, TPatientTeamConverter, TPatientTeamDao> implements TPatientTeamRepository {
}