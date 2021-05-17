package org.example.spring.daos.mysql.bill.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.bill.dao.TBillLogDao;
import org.example.spring.daos.mysql.bill.mapper.TBillLogMapper;
import org.example.spring.daos.mysql.bill.table.po.TBillLog;
import org.example.spring.daos.mysql.bill.table.query.TBillLogQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillLogDaoImpl extends TkExtDaoImpl<TBillLog, TBillLogQuery, TBillLogMapper> implements TBillLogDao {
}