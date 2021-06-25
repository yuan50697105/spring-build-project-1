package org.example.spring.repositories.bill.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.bill.postgres.table.po.TBillSubInfo;
import org.example.spring.repositories.bill.postgres.table.query.TBillSubInfoQuery;

import java.util.List;

public interface TBillSubInfoDao extends TkExtDao<TBillSubInfo, TBillSubInfoQuery> {
    List<TBillSubInfo> queryDetailsListByBillId(Long billId);
}
