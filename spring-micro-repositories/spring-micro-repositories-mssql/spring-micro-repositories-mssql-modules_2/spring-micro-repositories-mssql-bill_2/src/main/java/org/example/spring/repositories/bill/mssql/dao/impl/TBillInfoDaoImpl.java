package org.example.spring.repositories.bill.mssql.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.example.spring.repositories.bill.mssql.dao.TBillInfoDao;
import org.example.spring.repositories.bill.mssql.mapper.TBillInfoMapper;
import org.example.spring.repositories.bill.mssql.table.po.TBillInfo;
import org.example.spring.repositories.bill.mssql.table.query.TBillInfoQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillInfoDaoImpl extends TkExtDaoImpl<TBillInfo, TBillInfoQuery, TBillInfoMapper> implements TBillInfoDao {

}