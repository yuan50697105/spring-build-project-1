package org.example.spring.repositories.aggregation.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.aggregation.patient.table.dto.TPatientDTO;
import org.example.spring.repositories.aggregation.patient.table.po.TPatient;
import org.example.spring.repositories.aggregation.patient.table.query.TPatientQuery;
import org.example.spring.repositories.aggregation.patient.table.vo.TPatientVo;

public interface TPatientRepository extends IBaseRepository<TPatient, TPatientDTO, TPatientVo, TPatientQuery> {
}
