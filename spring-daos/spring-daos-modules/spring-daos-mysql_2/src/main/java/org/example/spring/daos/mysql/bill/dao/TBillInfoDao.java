package org.example.spring.daos.mysql.bill.dao;

import org.example.spring.daos.mysql.bill.table.po.TBillInfo;
import org.example.spring.daos.mysql.bill.table.query.TBillInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TBillInfoDao extends TkExtDao<TBillInfo, TBillInfoQuery> {
}
