package org.example.spring.daos.postgres.bill.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.postgres.bill.dao.TBillLogDao;
import org.example.spring.daos.postgres.bill.mapper.TBillLogMapper;
import org.example.spring.daos.postgres.bill.table.po.TBillLog;
import org.example.spring.daos.postgres.bill.table.query.TBillLogQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillLogDaoImpl extends TkExtDaoImpl<TBillLog, TBillLogQuery, TBillLogMapper> implements TBillLogDao {
}