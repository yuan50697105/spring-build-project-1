package org.example.spring.repositories.aggregation.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.aggregation.bill.converter.TBillInfoConverter;
import org.example.spring.repositories.aggregation.bill.dao.TBillInfoDao;
import org.example.spring.repositories.aggregation.bill.repository.TBillInfoRepository;
import org.example.spring.repositories.aggregation.bill.table.dto.TBillInfoDTO;
import org.example.spring.repositories.aggregation.bill.table.po.TBillInfo;
import org.example.spring.repositories.aggregation.bill.table.query.TBillInfoQuery;
import org.example.spring.repositories.aggregation.bill.table.vo.TBillInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillInfoRepositoryImpl extends IBaseRepositoryImpl<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery, TBillInfoConverter, TBillInfoDao> implements TBillInfoRepository {
}