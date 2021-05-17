package org.example.spring.daos.mysql.bill.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.bill.dao.TBillSubInfoDao;
import org.example.spring.daos.mysql.bill.mapper.TBillSubInfoMapper;
import org.example.spring.daos.mysql.bill.table.po.TBillSubInfo;
import org.example.spring.daos.mysql.bill.table.query.TBillSubInfoQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillSubInfoDaoImpl extends TkExtDaoImpl<TBillSubInfo, TBillSubInfoQuery, TBillSubInfoMapper> implements TBillSubInfoDao {
}