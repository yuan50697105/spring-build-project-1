package org.example.spring.daos.mysql.bill.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.bill.dao.BillInfoDao;
import org.example.spring.daos.mysql.bill.mapper.BillInfoMapper;
import org.example.spring.daos.mysql.bill.table.po.BillInfo;
import org.example.spring.daos.mysql.bill.table.query.BillInfoQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class BillInfoDaoImpl extends TkExtDaoImpl<BillInfo, BillInfoQuery, BillInfoMapper> implements BillInfoDao {

}