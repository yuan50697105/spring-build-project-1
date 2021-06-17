package org.example.spring.repositories.oracle.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.oracle.patient.converter.TPatientTeamConverter;
import org.example.spring.repositories.oracle.patient.dao.TPatientTeamDao;
import org.example.spring.repositories.oracle.patient.repository.TPatientTeamRepository;
import org.example.spring.repositories.oracle.patient.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.oracle.patient.table.po.TPatientTeam;
import org.example.spring.repositories.oracle.patient.table.query.TPatientTeamQuery;
import org.example.spring.repositories.oracle.patient.table.vo.TPatientTeamVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamRepositoryImpl extends IBaseRepositoryImpl<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery, TPatientTeamConverter, TPatientTeamDao> implements TPatientTeamRepository {
}