package org.example.spring.infrastructures.mysql.patient.repository.team;

import org.example.spring.infrastructures.mysql.patient.entity.query.PatientTeamQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientTeam;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientTeamDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientTeamFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface PatientTeamRepository extends IBaseRepository<PatientTeam, PatientTeamFormVo, PatientTeamDetails, PatientTeamQuery> {
}
