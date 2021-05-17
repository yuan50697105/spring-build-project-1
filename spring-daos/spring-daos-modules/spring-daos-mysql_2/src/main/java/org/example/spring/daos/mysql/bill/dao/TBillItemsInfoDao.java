package org.example.spring.daos.mysql.bill.dao;

import org.example.spring.daos.mysql.bill.table.po.TBillItemsInfo;
import org.example.spring.daos.mysql.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TBillItemsInfoDao extends TkExtDao<TBillItemsInfo, TBillItemsInfoQuery> {
}
