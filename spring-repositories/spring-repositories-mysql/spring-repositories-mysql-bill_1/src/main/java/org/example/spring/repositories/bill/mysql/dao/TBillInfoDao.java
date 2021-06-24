package org.example.spring.repositories.bill.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.bill.mysql.table.po.TBillInfo;
import org.example.spring.repositories.bill.mysql.table.query.TBillInfoQuery;

public interface TBillInfoDao extends TkExtDao<TBillInfo, TBillInfoQuery> {
}
