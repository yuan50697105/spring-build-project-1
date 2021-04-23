package org.example.spring.models.postgresql.patient.repository;

import org.example.spring.models.postgresql.patient.entity.query.PatientGroupQuery;
import org.example.spring.models.postgresql.patient.entity.result.PatientGroup;
import org.example.spring.models.postgresql.patient.entity.result.PatientGroupDetails;
import org.example.spring.models.postgresql.patient.entity.vo.PatientGroupFormVo;
import org.example.spring.models.commons.repository.IBaseRepository;

public interface PatientGroupRepository extends IBaseRepository<PatientGroup, PatientGroupFormVo, PatientGroupDetails, PatientGroupQuery> {
}