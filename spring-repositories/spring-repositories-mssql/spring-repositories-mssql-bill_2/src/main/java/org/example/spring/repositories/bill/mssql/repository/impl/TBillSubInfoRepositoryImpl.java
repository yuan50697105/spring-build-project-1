package org.example.spring.repositories.bill.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.mssql.converter.TBillSubInfoConverter;
import org.example.spring.repositories.bill.mssql.dao.TBillSubInfoDao;
import org.example.spring.repositories.bill.mssql.repository.TBillSubInfoRepository;
import org.example.spring.repositories.bill.mssql.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.bill.mssql.table.po.TBillSubInfo;
import org.example.spring.repositories.bill.mssql.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.bill.mssql.table.vo.TBillSubInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillSubInfoRepositoryImpl extends IBaseRepositoryImpl<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery, TBillSubInfoConverter, TBillSubInfoDao> implements TBillSubInfoRepository {
}