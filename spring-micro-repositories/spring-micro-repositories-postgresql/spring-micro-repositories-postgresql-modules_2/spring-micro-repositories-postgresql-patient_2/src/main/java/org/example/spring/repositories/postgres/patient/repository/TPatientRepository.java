package org.example.spring.repositories.postgres.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.postgres.patient.table.dto.TPatientDTO;
import org.example.spring.repositories.postgres.patient.table.po.TPatient;
import org.example.spring.repositories.postgres.patient.table.query.TPatientQuery;
import org.example.spring.repositories.postgres.patient.table.vo.TPatientVo;

public interface TPatientRepository extends IBaseRepository<TPatient, TPatientDTO, TPatientVo, TPatientQuery> {
}
