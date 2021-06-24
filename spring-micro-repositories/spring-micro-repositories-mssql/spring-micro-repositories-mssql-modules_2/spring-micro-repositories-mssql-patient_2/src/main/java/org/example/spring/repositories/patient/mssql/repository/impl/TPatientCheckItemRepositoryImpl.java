package org.example.spring.repositories.patient.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.mssql.converter.TPatientCheckItemConverter;
import org.example.spring.repositories.patient.mssql.dao.TPatientCheckItemDao;
import org.example.spring.repositories.patient.mssql.repository.TPatientCheckItemRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.mssql.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientCheckItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientCheckItemRepositoryImpl extends IBaseRepositoryImpl<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery, TPatientCheckItemConverter, TPatientCheckItemDao> implements TPatientCheckItemRepository {
}