package org.example.spring.repositories.bill.oracle.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.bill.mysql.table.po.TBillLog;
import org.example.spring.repositories.bill.mysql.table.query.TBillLogQuery;

public interface TBillLogDao extends TkExtDao<TBillLog, TBillLogQuery> {
}
