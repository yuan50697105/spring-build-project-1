package org.example.spring.repositories.bill.mysql.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.example.spring.repositories.bill.mysql.dao.TBillSubInfoDao;
import org.example.spring.repositories.bill.mysql.mapper.TBillSubInfoMapper;
import org.example.spring.repositories.bill.mysql.mapper.TBillSubInfoQueryMapper;
import org.example.spring.repositories.bill.mysql.table.po.TBillSubInfo;
import org.example.spring.repositories.bill.mysql.table.query.TBillSubInfoQuery;
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