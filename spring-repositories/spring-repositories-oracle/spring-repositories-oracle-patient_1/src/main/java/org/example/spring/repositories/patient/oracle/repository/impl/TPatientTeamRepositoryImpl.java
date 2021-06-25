package org.example.spring.repositories.patient.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.oracle.converter.TPatientTeamConverter;
import org.example.spring.repositories.patient.oracle.dao.TPatientTeamDao;
import org.example.spring.repositories.patient.oracle.repository.TPatientTeamRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientTeam;
import org.example.spring.repositories.patient.oracle.table.query.TPatientTeamQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientTeamVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamRepositoryImpl extends IBaseRepositoryImpl<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery, TPatientTeamConverter, TPatientTeamDao> implements TPatientTeamRepository {
}