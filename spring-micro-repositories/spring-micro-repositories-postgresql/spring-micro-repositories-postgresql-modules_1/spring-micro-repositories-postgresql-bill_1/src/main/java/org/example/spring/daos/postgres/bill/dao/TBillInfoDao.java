package org.example.spring.daos.postgres.bill.dao;

import org.example.spring.daos.postgres.bill.table.po.TBillInfo;
import org.example.spring.daos.postgres.bill.table.query.TBillInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TBillInfoDao extends TkExtDao<TBillInfo, TBillInfoQuery> {
}
