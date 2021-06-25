package org.example.spring.repositories.bill.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.oracle.converter.TBillInfoConverter;
import org.example.spring.repositories.bill.oracle.dao.TBillInfoDao;
import org.example.spring.repositories.bill.oracle.repository.TBillInfoRepository;
import org.example.spring.repositories.bill.oracle.table.dto.TBillInfoDTO;
import org.example.spring.repositories.bill.oracle.table.po.TBillInfo;
import org.example.spring.repositories.bill.oracle.table.query.TBillInfoQuery;
import org.example.spring.repositories.bill.oracle.table.vo.TBillInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillInfoRepositoryImpl extends IBaseRepositoryImpl<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery, TBillInfoConverter, TBillInfoDao> implements TBillInfoRepository {
}