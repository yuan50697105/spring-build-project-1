package org.example.spring.repositories.patient.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.postgres.converter.TPatientFeeItemConverter;
import org.example.spring.repositories.patient.postgres.dao.TPatientFeeItemDao;
import org.example.spring.repositories.patient.postgres.repository.TPatientFeeItemRepository;
import org.example.spring.repositories.patient.postgres.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.patient.postgres.table.po.TPatientFeeItem;
import org.example.spring.repositories.patient.postgres.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.patient.postgres.table.vo.TPatientFeeItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientFeeItemRepositoryImpl extends IBaseRepositoryImpl<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery, TPatientFeeItemConverter, TPatientFeeItemDao> implements TPatientFeeItemRepository {
}