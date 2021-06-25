package org.example.spring.repositories.bill.oracle.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.bill.oracle.table.po.TBillInfo;
import org.example.spring.repositories.bill.oracle.table.query.TBillInfoQuery;

public interface TBillInfoDao extends TkExtDao<TBillInfo, TBillInfoQuery> {
}
