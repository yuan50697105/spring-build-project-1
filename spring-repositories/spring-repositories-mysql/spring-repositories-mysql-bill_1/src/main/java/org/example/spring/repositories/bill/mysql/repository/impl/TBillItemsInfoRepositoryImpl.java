package org.example.spring.repositories.bill.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.mysql.converter.TBillItemsInfoConverter;
import org.example.spring.repositories.bill.mysql.dao.TBillItemsInfoDao;
import org.example.spring.repositories.bill.mysql.repository.TBillItemsInfoRepository;
import org.example.spring.repositories.bill.mysql.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.bill.mysql.table.po.TBillItemsInfo;
import org.example.spring.repositories.bill.mysql.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.bill.mysql.table.vo.TBillItemsInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillItemsInfoRepositoryImpl extends IBaseRepositoryImpl<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery, TBillItemsInfoConverter, TBillItemsInfoDao> implements TBillItemsInfoRepository {
}