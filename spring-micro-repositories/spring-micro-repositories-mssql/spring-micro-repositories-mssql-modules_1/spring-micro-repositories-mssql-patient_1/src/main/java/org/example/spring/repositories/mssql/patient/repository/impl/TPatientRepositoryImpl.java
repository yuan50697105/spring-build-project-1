package org.example.spring.repositories.mssql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mssql.patient.converter.TPatientConverter;
import org.example.spring.repositories.mssql.patient.dao.TPatientDao;
import org.example.spring.repositories.mssql.patient.repository.TPatientRepository;
import org.example.spring.repositories.mssql.patient.table.dto.TPatientDTO;
import org.example.spring.repositories.mssql.patient.table.po.TPatient;
import org.example.spring.repositories.mssql.patient.table.query.TPatientQuery;
import org.example.spring.repositories.mssql.patient.table.vo.TPatientVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientRepositoryImpl extends IBaseRepositoryImpl<TPatient, TPatientDTO, TPatientVo, TPatientQuery, TPatientConverter, TPatientDao> implements TPatientRepository {
}