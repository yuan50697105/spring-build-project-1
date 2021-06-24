package org.example.spring.repositories.patient.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.mysql.converter.TPatientTeamConverter;
import org.example.spring.repositories.patient.mysql.dao.TPatientTeamDao;
import org.example.spring.repositories.patient.mysql.repository.TPatientTeamRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientTeam;
import org.example.spring.repositories.patient.mysql.table.query.TPatientTeamQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientTeamVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientTeamRepositoryImpl extends IBaseRepositoryImpl<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery, TPatientTeamConverter, TPatientTeamDao> implements TPatientTeamRepository {
}