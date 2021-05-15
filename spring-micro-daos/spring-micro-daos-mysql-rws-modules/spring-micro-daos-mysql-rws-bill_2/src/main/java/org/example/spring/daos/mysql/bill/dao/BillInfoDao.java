package org.example.spring.daos.mysql.bill.dao;

import org.example.spring.daos.mysql.bill.table.po.BillInfo;
import org.example.spring.daos.mysql.bill.table.query.BillInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface BillInfoDao extends TkExtDao<BillInfo, BillInfoQuery> {
}
