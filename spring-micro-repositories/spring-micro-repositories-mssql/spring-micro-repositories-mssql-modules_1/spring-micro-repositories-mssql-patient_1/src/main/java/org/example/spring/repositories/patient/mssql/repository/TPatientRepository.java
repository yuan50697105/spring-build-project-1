package org.example.spring.repositories.patient.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatient;
import org.example.spring.repositories.patient.mssql.table.query.TPatientQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientVo;

public interface TPatientRepository extends IBaseRepository<TPatient, TPatientDTO, TPatientVo, TPatientQuery> {
}
