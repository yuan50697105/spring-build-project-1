package org.example.spring.repositories.bill.oracle.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.example.spring.repositories.bill.oracle.dao.TBillLogDao;
import org.example.spring.repositories.bill.oracle.mapper.TBillLogMapper;
import org.example.spring.repositories.bill.oracle.table.po.TBillLog;
import org.example.spring.repositories.bill.oracle.table.query.TBillLogQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillLogDaoImpl extends TkExtDaoImpl<TBillLog, TBillLogQuery, TBillLogMapper> implements TBillLogDao {
}