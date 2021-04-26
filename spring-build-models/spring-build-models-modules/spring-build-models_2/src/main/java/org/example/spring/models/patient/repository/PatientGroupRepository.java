package org.example.spring.models.patient.repository;

import org.example.spring.models.commons.repository.IBaseRepository;
import org.example.spring.models.patient.entity.query.PatientGroupQuery;
import org.example.spring.models.patient.entity.result.PatientGroup;
import org.example.spring.models.patient.entity.result.PatientGroupDetails;
import org.example.spring.models.patient.entity.vo.PatientGroupFormVo;

public interface PatientGroupRepository extends IBaseRepository<PatientGroup, PatientGroupFormVo, PatientGroupDetails, PatientGroupQuery> {
}