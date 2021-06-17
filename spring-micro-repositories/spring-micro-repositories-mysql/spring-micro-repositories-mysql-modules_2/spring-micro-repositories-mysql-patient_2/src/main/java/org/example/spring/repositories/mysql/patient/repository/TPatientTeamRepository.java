package org.example.spring.repositories.mysql.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientDTO;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientTeamDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatient;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeam;
import org.example.spring.repositories.mysql.patient.table.query.TPatientQuery;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientTeamVo;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientVo;

public interface TPatientTeamRepository extends IBaseRepository<TPatientTeam, TPatientTeamDTO, TPatientTeamVo, TPatientTeamQuery> {
}
