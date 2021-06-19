package org.example.spring.repositories.mysql.patient.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.patient.converter.TPatientFeeItemConverter;
import org.example.spring.repositories.mysql.patient.dao.TPatientFeeItemDao;
import org.example.spring.repositories.mysql.patient.repository.TPatientFeeItemRepository;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientFeeItemDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatientFeeItem;
import org.example.spring.repositories.mysql.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientFeeItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class TPatientFeeItemRepositoryImpl extends IBaseRepositoryImpl<TPatientFeeItem, TPatientFeeItemDTO, TPatientFeeItemVo, TPatientFeeItemQuery, TPatientFeeItemConverter, TPatientFeeItemDao> implements TPatientFeeItemRepository {
}