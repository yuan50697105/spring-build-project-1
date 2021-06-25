package org.example.spring.repositories.patient.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.mysql.converter.TPatientConverter;
import org.example.spring.repositories.patient.mysql.dao.TPatientDao;
import org.example.spring.repositories.patient.mysql.repository.TPatientRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatient;
import org.example.spring.repositories.patient.mysql.table.query.TPatientQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientRepositoryImpl extends IBaseRepositoryImpl<TPatient, TPatientDTO, TPatientVo, TPatientQuery, TPatientConverter, TPatientDao> implements TPatientRepository {
}