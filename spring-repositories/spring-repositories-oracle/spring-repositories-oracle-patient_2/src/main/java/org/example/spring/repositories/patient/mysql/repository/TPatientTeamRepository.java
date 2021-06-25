package org.example.spring.repositories.patient.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientTeam;
import org.example.spring.repositories.patient.oracle.table.query.TPatientTeamQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientTeamVo;

public interface TPatientTeamRepository extends IBaseRepository<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery> {
}
