package org.example.spring.repositories.postgres.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.postgres.patient.converter.TPatientCheckItemConverter;
import org.example.spring.repositories.postgres.patient.dao.TPatientCheckItemDao;
import org.example.spring.repositories.postgres.patient.repository.TPatientCheckItemRepository;
import org.example.spring.repositories.postgres.patient.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.postgres.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.postgres.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.postgres.patient.table.vo.TPatientCheckItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientCheckItemRepositoryImpl extends IBaseRepositoryImpl<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery, TPatientCheckItemConverter, TPatientCheckItemDao> implements TPatientCheckItemRepository {
}