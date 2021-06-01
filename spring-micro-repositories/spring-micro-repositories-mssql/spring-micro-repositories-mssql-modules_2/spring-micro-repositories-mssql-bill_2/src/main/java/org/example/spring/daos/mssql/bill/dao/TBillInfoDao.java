package org.example.spring.daos.mssql.bill.dao;

import org.example.spring.daos.mssql.bill.table.po.TBillInfo;
import org.example.spring.daos.mssql.bill.table.query.TBillInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TBillInfoDao extends TkExtDao<TBillInfo, TBillInfoQuery> {
}
