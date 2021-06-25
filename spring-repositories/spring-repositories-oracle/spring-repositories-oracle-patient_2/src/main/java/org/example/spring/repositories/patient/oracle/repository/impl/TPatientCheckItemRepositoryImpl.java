package org.example.spring.repositories.patient.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.oracle.converter.TPatientCheckItemConverter;
import org.example.spring.repositories.patient.oracle.dao.TPatientCheckItemDao;
import org.example.spring.repositories.patient.oracle.repository.TPatientCheckItemRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.oracle.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientCheckItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientCheckItemRepositoryImpl extends IBaseRepositoryImpl<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery, TPatientCheckItemConverter, TPatientCheckItemDao> implements TPatientCheckItemRepository {
}