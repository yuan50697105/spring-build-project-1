package org.example.spring.repositories.bill.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.bill.postgres.table.po.TBillLog;
import org.example.spring.repositories.bill.postgres.table.query.TBillLogQuery;

public interface TBillLogDao extends TkExtDao<TBillLog, TBillLogQuery> {
}
