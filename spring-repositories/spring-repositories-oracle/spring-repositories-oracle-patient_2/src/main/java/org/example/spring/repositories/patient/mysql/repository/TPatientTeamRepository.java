package org.example.spring.repositories.patient.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientTeam;
import org.example.spring.repositories.patient.mysql.table.query.TPatientTeamQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientTeamVo;

public interface TPatientTeamRepository extends IBaseRepository<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery> {
}
