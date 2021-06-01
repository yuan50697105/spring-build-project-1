package org.example.spring.repositories.mssql.bill.dao;

import org.example.spring.repositories.mssql.bill.table.po.TBillItemsInfo;
import org.example.spring.repositories.mssql.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

import java.util.List;

public interface TBillItemsInfoDao extends TkExtDao<TBillItemsInfo, TBillItemsInfoQuery> {
    List<TBillItemsInfo> queryListBySubId(Long subId);

    List<TBillItemsInfo> queryListByBillId(Long billId);
}
