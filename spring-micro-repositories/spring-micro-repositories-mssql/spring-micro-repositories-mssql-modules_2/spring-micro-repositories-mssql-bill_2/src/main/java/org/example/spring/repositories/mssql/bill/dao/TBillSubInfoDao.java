package org.example.spring.repositories.mssql.bill.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.mssql.bill.table.po.TBillSubInfo;
import org.example.spring.repositories.mssql.bill.table.query.TBillSubInfoQuery;

import java.util.List;

public interface TBillSubInfoDao extends TkExtDao<TBillSubInfo, TBillSubInfoQuery> {
    List<TBillSubInfo> queryDetailsListByBillId(Long billId);
}
