package org.example.spring.repositories.patient.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.mysql.converter.TPatientCheckItemConverter;
import org.example.spring.repositories.patient.mysql.dao.TPatientCheckItemDao;
import org.example.spring.repositories.patient.mysql.repository.TPatientCheckItemRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.mysql.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientCheckItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientCheckItemRepositoryImpl extends IBaseRepositoryImpl<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery, TPatientCheckItemConverter, TPatientCheckItemDao> implements TPatientCheckItemRepository {
}