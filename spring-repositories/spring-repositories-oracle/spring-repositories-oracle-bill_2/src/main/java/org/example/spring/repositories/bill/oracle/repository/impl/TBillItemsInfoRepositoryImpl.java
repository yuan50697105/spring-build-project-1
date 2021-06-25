package org.example.spring.repositories.bill.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.oracle.converter.TBillItemsInfoConverter;
import org.example.spring.repositories.bill.oracle.dao.TBillItemsInfoDao;
import org.example.spring.repositories.bill.oracle.repository.TBillItemsInfoRepository;
import org.example.spring.repositories.bill.oracle.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.bill.oracle.table.po.TBillItemsInfo;
import org.example.spring.repositories.bill.oracle.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.bill.oracle.table.vo.TBillItemsInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillItemsInfoRepositoryImpl extends IBaseRepositoryImpl<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery, TBillItemsInfoConverter, TBillItemsInfoDao> implements TBillItemsInfoRepository {
}