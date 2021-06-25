package org.example.spring.repositories.patient.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientTeam;
import org.example.spring.repositories.patient.postgres.table.query.TPatientTeamQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientTeamVo;

public interface TPatientTeamRepository extends IBaseRepository<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery> {
}
