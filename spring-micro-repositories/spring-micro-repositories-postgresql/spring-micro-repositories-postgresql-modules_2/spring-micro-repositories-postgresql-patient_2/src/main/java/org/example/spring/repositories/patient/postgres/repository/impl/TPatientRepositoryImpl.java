package org.example.spring.repositories.patient.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.postgres.converter.TPatientConverter;
import org.example.spring.repositories.patient.postgres.dao.TPatientDao;
import org.example.spring.repositories.patient.postgres.repository.TPatientRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatient;
import org.example.spring.repositories.patient.postgres.table.query.TPatientQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientRepositoryImpl extends IBaseRepositoryImpl<TPatient, TPatientDTO, TPatientVo, TPatientQuery, TPatientConverter, TPatientDao> implements TPatientRepository {
}