package org.example.spring.repositories.oracle.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.patient.table.dto.TPatientDTO;
import org.example.spring.repositories.oracle.patient.table.po.TPatient;
import org.example.spring.repositories.oracle.patient.table.query.TPatientQuery;
import org.example.spring.repositories.oracle.patient.table.vo.TPatientVo;

public interface TPatientRepository extends IBaseRepository<TPatient, TPatientDTO, TPatientVo, TPatientQuery> {
}
