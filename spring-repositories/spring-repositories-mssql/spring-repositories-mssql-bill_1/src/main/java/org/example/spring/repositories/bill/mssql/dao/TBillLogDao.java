package org.example.spring.repositories.bill.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.bill.mssql.table.po.TBillLog;
import org.example.spring.repositories.bill.mssql.table.query.TBillLogQuery;

public interface TBillLogDao extends TkExtDao<TBillLog, TBillLogQuery> {
}
