package org.example.spring.repositories.patient.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientTeam;
import org.example.spring.repositories.patient.mssql.table.query.TPatientTeamQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientTeamVo;

public interface TPatientTeamRepository extends IBaseRepository<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery> {
}
