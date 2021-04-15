package org.example.spring.infrastructures.mysql.patient.repository;

import org.example.spring.infrastructures.mysql.patient.entity.query.PatientGroupQuery;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroup;
import org.example.spring.infrastructures.mysql.patient.entity.result.PatientGroupDetails;
import org.example.spring.infrastructures.mysql.patient.entity.vo.PatientGroupFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface PatientGroupRepository extends IBaseRepository<PatientGroup, PatientGroupFormVo, PatientGroupDetails, PatientGroupQuery> {
}