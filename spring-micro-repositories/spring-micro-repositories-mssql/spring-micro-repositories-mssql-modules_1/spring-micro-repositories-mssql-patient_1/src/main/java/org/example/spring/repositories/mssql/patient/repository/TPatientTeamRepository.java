package org.example.spring.repositories.mssql.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mssql.patient.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.mssql.patient.table.po.TPatientTeam;
import org.example.spring.repositories.mssql.patient.table.query.TPatientTeamQuery;
import org.example.spring.repositories.mssql.patient.table.vo.TPatientTeamVo;

public interface TPatientTeamRepository extends IBaseRepository<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery> {
}
