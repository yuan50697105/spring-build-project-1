package org.example.spring.repositories.patient.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatient;
import org.example.spring.repositories.patient.oracle.table.query.TPatientQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientVo;

public interface TPatientRepository extends IBaseRepository<TPatient, TPatientDTO, TPatientVo, TPatientQuery> {
}
