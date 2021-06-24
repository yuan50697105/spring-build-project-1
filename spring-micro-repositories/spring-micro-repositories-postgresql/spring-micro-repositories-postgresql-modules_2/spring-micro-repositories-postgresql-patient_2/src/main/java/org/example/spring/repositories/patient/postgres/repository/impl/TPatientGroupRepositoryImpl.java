package org.example.spring.repositories.patient.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.postgres.converter.TPatientGroupConverter;
import org.example.spring.repositories.patient.postgres.dao.TPatientGroupDao;
import org.example.spring.repositories.patient.postgres.repository.TPatientGroupRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientGroupDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientGroup;
import org.example.spring.repositories.patient.postgres.table.query.TPatientGroupQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientGroupVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientGroupRepositoryImpl extends IBaseRepositoryImpl<TPatientGroup, TPatientGroupDTO, TPatientGroupVo, TPatientGroupQuery, TPatientGroupConverter, TPatientGroupDao> implements TPatientGroupRepository {
}