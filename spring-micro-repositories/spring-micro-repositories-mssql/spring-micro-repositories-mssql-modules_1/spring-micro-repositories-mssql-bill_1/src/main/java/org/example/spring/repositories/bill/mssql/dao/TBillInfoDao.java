package org.example.spring.repositories.bill.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.bill.mssql.table.po.TBillInfo;
import org.example.spring.repositories.bill.mssql.table.query.TBillInfoQuery;

public interface TBillInfoDao extends TkExtDao<TBillInfo, TBillInfoQuery> {
}
