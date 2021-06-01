package org.example.spring.repositories.mssql.bill.dao;

import org.example.spring.repositories.mssql.bill.table.po.TBillLog;
import org.example.spring.repositories.mssql.bill.table.query.TBillLogQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TBillLogDao extends TkExtDao<TBillLog, TBillLogQuery> {
}
