package org.example.spring.repositories.bill.postgres.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.example.spring.repositories.bill.postgres.dao.TBillItemsInfoDao;
import org.example.spring.repositories.bill.postgres.mapper.TBillItemsInfoMapper;
import org.example.spring.repositories.bill.postgres.mapper.TBillItemsInfoQueryMapper;
import org.example.spring.repositories.bill.postgres.table.po.TBillItemsInfo;
import org.example.spring.repositories.bill.postgres.table.query.TBillItemsInfoQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class TBillItemsInfoDaoImpl extends TkExtDaoImpl<TBillItemsInfo, TBillItemsInfoQuery, TBillItemsInfoMapper> implements TBillItemsInfoDao {
    private final TBillItemsInfoQueryMapper billItemsInfoQueryMapper;

    @Override
    public List<TBillItemsInfo> queryListBySubId(Long subId) {
        return billItemsInfoQueryMapper.queryListBySubId(subId);
    }

    @Override
    public List<TBillItemsInfo> queryListByBillId(Long billId) {
        return billItemsInfoQueryMapper.queryListByBillId(billId);
    }
}