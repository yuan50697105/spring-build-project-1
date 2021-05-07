package org.example.spring.models.clickhouse.patient.repository;

import org.example.spring.models.clickhouse.patient.entity.query.PatientTeamQuery;
import org.example.spring.models.clickhouse.patient.entity.result.PatientTeam;
import org.example.spring.models.clickhouse.patient.entity.result.PatientTeamDetails;
import org.example.spring.models.clickhouse.patient.entity.vo.PatientTeamFormVo;
import org.example.spring.models.commons.repository.IBaseRepository;

public interface PatientTeamRepository extends IBaseRepository<PatientTeam, PatientTeamFormVo, PatientTeamDetails, PatientTeamQuery> {
}
