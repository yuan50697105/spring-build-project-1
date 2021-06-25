package org.example.spring.repositories.bill.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.oracle.converter.TBillSubInfoConverter;
import org.example.spring.repositories.bill.oracle.dao.TBillSubInfoDao;
import org.example.spring.repositories.bill.oracle.repository.TBillSubInfoRepository;
import org.example.spring.repositories.bill.oracle.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.bill.oracle.table.po.TBillSubInfo;
import org.example.spring.repositories.bill.oracle.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.bill.oracle.table.vo.TBillSubInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillSubInfoRepositoryImpl extends IBaseRepositoryImpl<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery, TBillSubInfoConverter, TBillSubInfoDao> implements TBillSubInfoRepository {
}