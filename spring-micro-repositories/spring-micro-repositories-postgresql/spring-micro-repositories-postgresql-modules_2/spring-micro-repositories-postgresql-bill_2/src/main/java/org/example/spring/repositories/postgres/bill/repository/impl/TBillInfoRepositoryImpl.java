package org.example.spring.repositories.postgres.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.postgres.bill.converter.TBillInfoConverter;
import org.example.spring.repositories.postgres.bill.dao.TBillInfoDao;
import org.example.spring.repositories.postgres.bill.repository.TBillInfoRepository;
import org.example.spring.repositories.postgres.bill.table.dto.TBillInfoDTO;
import org.example.spring.repositories.postgres.bill.table.po.TBillInfo;
import org.example.spring.repositories.postgres.bill.table.query.TBillInfoQuery;
import org.example.spring.repositories.postgres.bill.table.vo.TBillInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillInfoRepositoryImpl extends IBaseRepositoryImpl<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery, TBillInfoConverter, TBillInfoDao> implements TBillInfoRepository {
}