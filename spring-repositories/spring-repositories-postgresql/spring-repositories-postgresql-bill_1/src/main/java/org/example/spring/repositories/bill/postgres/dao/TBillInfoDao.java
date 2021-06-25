package org.example.spring.repositories.bill.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.bill.postgres.table.po.TBillInfo;
import org.example.spring.repositories.bill.postgres.table.query.TBillInfoQuery;

public interface TBillInfoDao extends TkExtDao<TBillInfo, TBillInfoQuery> {
}
