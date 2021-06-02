package org.example.spring.repositories.mysql.bill.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.mysql.bill.table.po.TBillInfo;
import org.example.spring.repositories.mysql.bill.table.query.TBillInfoQuery;

public interface TBillInfoDao extends TkExtDao<TBillInfo, TBillInfoQuery> {
}