package org.example.spring.repositories.bill.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.postgres.converter.TBillSubInfoConverter;
import org.example.spring.repositories.bill.postgres.dao.TBillSubInfoDao;
import org.example.spring.repositories.bill.postgres.repository.TBillSubInfoRepository;
import org.example.spring.repositories.bill.postgres.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.bill.postgres.table.po.TBillSubInfo;
import org.example.spring.repositories.bill.postgres.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.bill.postgres.table.vo.TBillSubInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillSubInfoRepositoryImpl extends IBaseRepositoryImpl<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery, TBillSubInfoConverter, TBillSubInfoDao> implements TBillSubInfoRepository {
}