package org.example.spring.repositories.bill.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.mssql.converter.TBillInfoConverter;
import org.example.spring.repositories.bill.mssql.dao.TBillInfoDao;
import org.example.spring.repositories.bill.mssql.repository.TBillInfoRepository;
import org.example.spring.repositories.bill.mssql.table.dto.TBillInfoDTO;
import org.example.spring.repositories.bill.mssql.table.po.TBillInfo;
import org.example.spring.repositories.bill.mssql.table.query.TBillInfoQuery;
import org.example.spring.repositories.bill.mssql.table.vo.TBillInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillInfoRepositoryImpl extends IBaseRepositoryImpl<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery, TBillInfoConverter, TBillInfoDao> implements TBillInfoRepository {
}