package org.example.spring.repositories.bill.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.mssql.converter.TBillItemsInfoConverter;
import org.example.spring.repositories.bill.mssql.dao.TBillItemsInfoDao;
import org.example.spring.repositories.bill.mssql.repository.TBillItemsInfoRepository;
import org.example.spring.repositories.bill.mssql.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.bill.mssql.table.po.TBillItemsInfo;
import org.example.spring.repositories.bill.mssql.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.bill.mssql.table.vo.TBillItemsInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillItemsInfoRepositoryImpl extends IBaseRepositoryImpl<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery, TBillItemsInfoConverter, TBillItemsInfoDao> implements TBillItemsInfoRepository {
}