package org.example.spring.repositories.patient.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatient;
import org.example.spring.repositories.patient.mysql.table.query.TPatientQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientVo;

public interface TPatientRepository extends IBaseRepository<TPatient, TPatientDTO, TPatientVo, TPatientQuery> {
}
