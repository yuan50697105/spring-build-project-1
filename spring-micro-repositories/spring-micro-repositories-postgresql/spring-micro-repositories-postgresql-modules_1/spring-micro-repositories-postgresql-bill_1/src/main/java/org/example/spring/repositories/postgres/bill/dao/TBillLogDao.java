package org.example.spring.repositories.postgres.bill.dao;

import org.example.spring.repositories.postgres.bill.table.po.TBillLog;
import org.example.spring.repositories.postgres.bill.table.query.TBillLogQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TBillLogDao extends TkExtDao<TBillLog, TBillLogQuery> {
}
