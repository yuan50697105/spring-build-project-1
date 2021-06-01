package org.example.spring.repositories.postgres.bill.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.repositories.postgres.bill.dao.TBillSubInfoDao;
import org.example.spring.repositories.postgres.bill.mapper.TBillSubInfoMapper;
import org.example.spring.repositories.postgres.bill.mapper.TBillSubInfoQueryMapper;
import org.example.spring.repositories.postgres.bill.table.po.TBillSubInfo;
import org.example.spring.repositories.postgres.bill.table.query.TBillSubInfoQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
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