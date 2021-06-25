package org.example.spring.repositories.patient.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.oracle.converter.TPatientGroupConverter;
import org.example.spring.repositories.patient.oracle.dao.TPatientGroupDao;
import org.example.spring.repositories.patient.oracle.repository.TPatientGroupRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientGroupDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientGroup;
import org.example.spring.repositories.patient.oracle.table.query.TPatientGroupQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientGroupVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientGroupRepositoryImpl extends IBaseRepositoryImpl<TPatientGroup, TPatientGroupDTO, TPatientGroupVo, TPatientGroupQuery, TPatientGroupConverter, TPatientGroupDao> implements TPatientGroupRepository {
}