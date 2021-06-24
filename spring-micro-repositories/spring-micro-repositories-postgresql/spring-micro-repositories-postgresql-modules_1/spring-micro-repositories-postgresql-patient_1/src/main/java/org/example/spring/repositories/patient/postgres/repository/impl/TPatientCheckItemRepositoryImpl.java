package org.example.spring.repositories.patient.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.postgres.converter.TPatientCheckItemConverter;
import org.example.spring.repositories.patient.postgres.dao.TPatientCheckItemDao;
import org.example.spring.repositories.patient.postgres.repository.TPatientCheckItemRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.postgres.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientCheckItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientCheckItemRepositoryImpl extends IBaseRepositoryImpl<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery, TPatientCheckItemConverter, TPatientCheckItemDao> implements TPatientCheckItemRepository {
}