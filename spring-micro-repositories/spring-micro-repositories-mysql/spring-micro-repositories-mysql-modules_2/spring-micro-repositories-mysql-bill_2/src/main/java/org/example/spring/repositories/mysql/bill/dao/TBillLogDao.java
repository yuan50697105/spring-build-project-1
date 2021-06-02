package org.example.spring.repositories.mysql.bill.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.mysql.bill.table.po.TBillLog;
import org.example.spring.repositories.mysql.bill.table.query.TBillLogQuery;

public interface TBillLogDao extends TkExtDao<TBillLog, TBillLogQuery> {
}
