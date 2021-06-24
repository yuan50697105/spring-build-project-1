package org.example.spring.repositories.bill.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.postgres.converter.TBillItemsInfoConverter;
import org.example.spring.repositories.bill.postgres.dao.TBillItemsInfoDao;
import org.example.spring.repositories.bill.postgres.repository.TBillItemsInfoRepository;
import org.example.spring.repositories.bill.postgres.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.bill.postgres.table.po.TBillItemsInfo;
import org.example.spring.repositories.bill.postgres.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.bill.postgres.table.vo.TBillItemsInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillItemsInfoRepositoryImpl extends IBaseRepositoryImpl<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery, TBillItemsInfoConverter, TBillItemsInfoDao> implements TBillItemsInfoRepository {
}