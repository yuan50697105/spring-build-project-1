package org.example.spring.repositories.bill.postgres.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.example.spring.repositories.bill.postgres.dao.TBillSubInfoDao;
import org.example.spring.repositories.bill.postgres.mapper.TBillSubInfoMapper;
import org.example.spring.repositories.bill.postgres.mapper.TBillSubInfoQueryMapper;
import org.example.spring.repositories.bill.postgres.table.po.TBillSubInfo;
import org.example.spring.repositories.bill.postgres.table.query.TBillSubInfoQuery;
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