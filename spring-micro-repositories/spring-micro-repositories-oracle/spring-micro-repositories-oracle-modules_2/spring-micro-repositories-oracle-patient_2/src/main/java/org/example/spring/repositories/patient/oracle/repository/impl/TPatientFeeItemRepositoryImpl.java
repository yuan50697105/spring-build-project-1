package org.example.spring.repositories.patient.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.oracle.converter.TPatientFeeItemConverter;
import org.example.spring.repositories.patient.oracle.dao.TPatientFeeItemDao;
import org.example.spring.repositories.patient.oracle.repository.TPatientFeeItemRepository;
import org.example.spring.repositories.patient.oracle.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.patient.oracle.table.po.TPatientFeeItem;
import org.example.spring.repositories.patient.oracle.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.patient.oracle.table.vo.TPatientFeeItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientFeeItemRepositoryImpl extends IBaseRepositoryImpl<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery, TPatientFeeItemConverter, TPatientFeeItemDao> implements TPatientFeeItemRepository {
}