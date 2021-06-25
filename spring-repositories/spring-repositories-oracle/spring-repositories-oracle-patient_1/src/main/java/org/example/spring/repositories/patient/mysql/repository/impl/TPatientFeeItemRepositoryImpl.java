package org.example.spring.repositories.patient.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.patient.mysql.converter.TPatientFeeItemConverter;
import org.example.spring.repositories.patient.mysql.dao.TPatientFeeItemDao;
import org.example.spring.repositories.patient.mysql.repository.TPatientFeeItemRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientFeeItem;
import org.example.spring.repositories.patient.mysql.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientFeeItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientFeeItemRepositoryImpl extends IBaseRepositoryImpl<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery, TPatientFeeItemConverter, TPatientFeeItemDao> implements TPatientFeeItemRepository {
}