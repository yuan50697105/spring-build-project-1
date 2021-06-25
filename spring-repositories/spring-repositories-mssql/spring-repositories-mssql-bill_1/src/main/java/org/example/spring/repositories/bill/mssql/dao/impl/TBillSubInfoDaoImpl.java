package org.example.spring.repositories.bill.mssql.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.example.spring.repositories.bill.mssql.dao.TBillSubInfoDao;
import org.example.spring.repositories.bill.mssql.mapper.TBillSubInfoMapper;
import org.example.spring.repositories.bill.mssql.mapper.TBillSubInfoQueryMapper;
import org.example.spring.repositories.bill.mssql.table.po.TBillSubInfo;
import org.example.spring.repositories.bill.mssql.table.query.TBillSubInfoQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class TBillSubInfoDaoImpl extends TkExtDaoImpl<TBillSubInfo, TBillSubInfoQuery, TBillSubInfoMapper> implements TBillSubInfoDao {
    private final TBillSubInfoQueryMapper billSubInfoQueryMapper;

    @Override
    public List<TBillSubInfo> queryDetailsListByBillId(Long billId) {
        return billSubInfoQueryMapper.queryDetailsListByBillId(billId);
    }
}