package org.example.spring.repositories.aggregation.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.aggregation.patient.converter.TPatientGroupConverter;
import org.example.spring.repositories.aggregation.patient.dao.TPatientGroupDao;
import org.example.spring.repositories.aggregation.patient.repository.TPatientGroupRepository;
import org.example.spring.repositories.aggregation.patient.table.dto.TPatientGroupDTO;
import org.example.spring.repositories.aggregation.patient.table.po.TPatientGroup;
import org.example.spring.repositories.aggregation.patient.table.query.TPatientGroupQuery;
import org.example.spring.repositories.aggregation.patient.table.vo.TPatientGroupVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientGroupRepositoryImpl extends IBaseRepositoryImpl<TPatientGroup, TPatientGroupDTO, TPatientGroupVo, TPatientGroupQuery, TPatientGroupConverter, TPatientGroupDao> implements TPatientGroupRepository {
}