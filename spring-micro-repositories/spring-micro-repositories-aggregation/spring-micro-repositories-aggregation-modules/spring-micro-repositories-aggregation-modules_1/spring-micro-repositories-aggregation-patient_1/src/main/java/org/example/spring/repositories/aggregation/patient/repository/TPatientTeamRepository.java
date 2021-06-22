package org.example.spring.repositories.aggregation.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.aggregation.patient.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.aggregation.patient.table.po.TPatientTeam;
import org.example.spring.repositories.aggregation.patient.table.query.TPatientTeamQuery;
import org.example.spring.repositories.aggregation.patient.table.vo.TPatientTeamVo;

public interface TPatientTeamRepository extends IBaseRepository<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery> {
}
