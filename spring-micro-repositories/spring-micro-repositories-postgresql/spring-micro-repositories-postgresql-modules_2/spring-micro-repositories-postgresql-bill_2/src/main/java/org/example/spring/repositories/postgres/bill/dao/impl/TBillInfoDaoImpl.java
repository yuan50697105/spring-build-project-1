package org.example.spring.repositories.postgres.bill.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.example.spring.repositories.postgres.bill.dao.TBillInfoDao;
import org.example.spring.repositories.postgres.bill.mapper.TBillInfoMapper;
import org.example.spring.repositories.postgres.bill.table.po.TBillInfo;
import org.example.spring.repositories.postgres.bill.table.query.TBillInfoQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillInfoDaoImpl extends TkExtDaoImpl<TBillInfo, TBillInfoQuery, TBillInfoMapper> implements TBillInfoDao {

}