package org.example.spring.daos.mysql.bill.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.bill.dao.TBillItemsInfoDao;
import org.example.spring.daos.mysql.bill.mapper.TBillItemsInfoMapper;
import org.example.spring.daos.mysql.bill.table.po.TBillItemsInfo;
import org.example.spring.daos.mysql.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillItemsInfoDaoImpl extends TkExtDaoImpl<TBillItemsInfo, TBillItemsInfoQuery, TBillItemsInfoMapper> implements TBillItemsInfoDao {
}