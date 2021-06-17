package org.example.spring.repositories.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.patient.converter.TPatientConverter;
import org.example.spring.repositories.mysql.patient.converter.TPatientGroupConverter;
import org.example.spring.repositories.mysql.patient.dao.TPatientDao;
import org.example.spring.repositories.mysql.patient.dao.TPatientGroupDao;
import org.example.spring.repositories.mysql.patient.repository.TPatientGroupRepository;
import org.example.spring.repositories.mysql.patient.repository.TPatientRepository;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientDTO;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientGroupDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatient;
import org.example.spring.repositories.mysql.patient.table.po.TPatientGroup;
import org.example.spring.repositories.mysql.patient.table.query.TPatientGroupQuery;
import org.example.spring.repositories.mysql.patient.table.query.TPatientQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientGroupVo;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientGroupRepositoryImpl extends IBaseRepositoryImpl<TPatientGroup, TPatientGroupDTO, TPatientGroupVo, TPatientGroupQuery, TPatientGroupConverter, TPatientGroupDao> implements TPatientGroupRepository {
}