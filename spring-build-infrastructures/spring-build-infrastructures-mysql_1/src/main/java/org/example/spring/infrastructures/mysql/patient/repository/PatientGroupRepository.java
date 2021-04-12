package org.example.spring.infrastructures.mysql.patient.repository;

import org.example.spring.infrastructures.mysql.patient.entity.query.PatientTeamQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientTeam;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroupDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientTeamFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface PatientGroupRepository extends IBaseRepository<PatientTeam, PatientTeamFormVo, PatientGroupDetails, PatientTeamQuery> {
}
