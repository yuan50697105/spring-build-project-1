package org.example.spring.daos.postgres.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.postgres.bill.converter.TBillItemsInfoConverter;
import org.example.spring.daos.postgres.bill.dao.TBillItemsInfoDao;
import org.example.spring.daos.postgres.bill.repository.TBillItemsInfo2Repository;
import org.example.spring.daos.postgres.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.daos.postgres.bill.table.po.TBillItemsInfo;
import org.example.spring.daos.postgres.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.daos.postgres.bill.table.vo.TBillItemsInfoVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillItemsInfo2RepositoryImpl extends IBaseRepositoryImpl<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery, TBillItemsInfoConverter, TBillItemsInfoDao> implements TBillItemsInfo2Repository {
}