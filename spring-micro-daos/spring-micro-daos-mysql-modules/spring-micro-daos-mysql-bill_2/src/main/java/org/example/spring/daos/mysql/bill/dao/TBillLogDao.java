package org.example.spring.daos.mysql.bill.dao;

import org.example.spring.daos.mysql.bill.table.po.TBillLog;
import org.example.spring.daos.mysql.bill.table.query.TBillLogQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TBillLogDao extends TkExtDao<TBillLog, TBillLogQuery> {
}