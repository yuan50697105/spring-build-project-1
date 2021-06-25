package org.example.spring.repositories.bill.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.bill.mssql.table.po.TBillItemsInfo;
import org.example.spring.repositories.bill.mssql.table.query.TBillItemsInfoQuery;

import java.util.List;

public interface TBillItemsInfoDao extends TkExtDao<TBillItemsInfo, TBillItemsInfoQuery> {
    List<TBillItemsInfo> queryListBySubId(Long subId);

    List<TBillItemsInfo> queryListByBillId(Long billId);
}
