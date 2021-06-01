package org.example.spring.repositories.mssql.bill.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.mssql.bill.table.po.TBillInfo;
import org.example.spring.repositories.mssql.bill.table.query.TBillInfoQuery;

public interface TBillInfoDao extends TkExtDao<TBillInfo, TBillInfoQuery> {
}
