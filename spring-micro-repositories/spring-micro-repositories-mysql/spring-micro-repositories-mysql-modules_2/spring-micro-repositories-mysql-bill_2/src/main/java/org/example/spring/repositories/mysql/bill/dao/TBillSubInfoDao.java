package org.example.spring.repositories.mysql.bill.dao;

import org.example.spring.daos.mysql.bill.table.po.TBillSubInfo;
import org.example.spring.daos.mysql.bill.table.query.TBillSubInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

import java.util.List;

public interface TBillSubInfoDao extends TkExtDao<TBillSubInfo, TBillSubInfoQuery> {
    List<TBillSubInfo> queryDetailsListByBillId(Long billId);
}
