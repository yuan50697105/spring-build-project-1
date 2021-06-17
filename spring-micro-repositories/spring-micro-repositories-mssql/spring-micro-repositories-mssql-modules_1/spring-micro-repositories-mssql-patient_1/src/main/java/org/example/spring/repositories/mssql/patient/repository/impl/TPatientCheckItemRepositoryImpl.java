package org.example.spring.repositories.mssql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mssql.patient.converter.TPatientCheckItemConverter;
import org.example.spring.repositories.mssql.patient.dao.TPatientCheckItemDao;
import org.example.spring.repositories.mssql.patient.repository.TPatientCheckItemRepository;
import org.example.spring.repositories.mssql.patient.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.mssql.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.mssql.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.mssql.patient.table.vo.TPatientCheckItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientCheckItemRepositoryImpl extends IBaseRepositoryImpl<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery, TPatientCheckItemConverter, TPatientCheckItemDao> implements TPatientCheckItemRepository {
}