package org.example.spring.repositories.patient.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.oracle.converter.TPatientConverter;
import org.example.spring.repositories.patient.oracle.dao.TPatientDao;
import org.example.spring.repositories.patient.oracle.repository.TPatientRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatient;
import org.example.spring.repositories.patient.oracle.table.query.TPatientQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientRepositoryImpl extends IBaseRepositoryImpl<TPatient, TPatientDTO, TPatientVo, TPatientQuery, TPatientConverter, TPatientDao> implements TPatientRepository {
}