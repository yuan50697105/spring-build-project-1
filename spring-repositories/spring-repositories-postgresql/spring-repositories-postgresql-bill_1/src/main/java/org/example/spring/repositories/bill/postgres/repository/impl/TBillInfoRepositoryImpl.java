package org.example.spring.repositories.bill.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.postgres.converter.TBillInfoConverter;
import org.example.spring.repositories.bill.postgres.dao.TBillInfoDao;
import org.example.spring.repositories.bill.postgres.repository.TBillInfoRepository;
import org.example.spring.repositories.bill.postgres.table.dto.TBillInfoDTO;
import org.example.spring.repositories.bill.postgres.table.po.TBillInfo;
import org.example.spring.repositories.bill.postgres.table.query.TBillInfoQuery;
import org.example.spring.repositories.bill.postgres.table.vo.TBillInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillInfoRepositoryImpl extends IBaseRepositoryImpl<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery, TBillInfoConverter, TBillInfoDao> implements TBillInfoRepository {
}