package org.example.spring.repositories.aggregation.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.aggregation.bill.converter.TBillItemsInfoConverter;
import org.example.spring.repositories.aggregation.bill.dao.TBillItemsInfoDao;
import org.example.spring.repositories.aggregation.bill.repository.TBillItemsInfoRepository;
import org.example.spring.repositories.aggregation.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.aggregation.bill.table.po.TBillItemsInfo;
import org.example.spring.repositories.aggregation.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.aggregation.bill.table.vo.TBillItemsInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillItemsInfoRepositoryImpl extends IBaseRepositoryImpl<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery, TBillItemsInfoConverter, TBillItemsInfoDao> implements TBillItemsInfoRepository {
}