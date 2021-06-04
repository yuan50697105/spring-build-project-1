package org.example.spring.repositories.oracle.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.oracle.bill.converter.TBillItemsInfoConverter;
import org.example.spring.repositories.oracle.bill.dao.TBillItemsInfoDao;
import org.example.spring.repositories.oracle.bill.repository.TBillItemsInfoRepository;
import org.example.spring.repositories.oracle.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.oracle.bill.table.po.TBillItemsInfo;
import org.example.spring.repositories.oracle.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.oracle.bill.table.vo.TBillItemsInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillItemsInfoRepositoryImpl extends IBaseRepositoryImpl<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery, TBillItemsInfoConverter, TBillItemsInfoDao> implements TBillItemsInfoRepository {
}