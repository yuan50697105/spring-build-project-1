package org.example.spring.daos.mssql.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mssql.bill.converter.TBillSubInfoConverter;
import org.example.spring.daos.mssql.bill.dao.TBillSubInfoDao;
import org.example.spring.daos.mssql.bill.repository.TBillSubInfo2Repository;
import org.example.spring.daos.mssql.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.daos.mssql.bill.table.po.TBillSubInfo;
import org.example.spring.daos.mssql.bill.table.query.TBillSubInfoQuery;
import org.example.spring.daos.mssql.bill.table.vo.TBillSubInfoVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillSubInfo2RepositoryImpl extends IBaseRepositoryImpl<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery, TBillSubInfoConverter, TBillSubInfoDao> implements TBillSubInfo2Repository {
}