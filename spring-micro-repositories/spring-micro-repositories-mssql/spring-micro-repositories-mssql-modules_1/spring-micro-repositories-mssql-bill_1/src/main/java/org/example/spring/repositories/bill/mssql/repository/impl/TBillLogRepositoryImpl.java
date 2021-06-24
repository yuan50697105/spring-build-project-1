package org.example.spring.repositories.bill.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.mssql.converter.TBillLogConverter;
import org.example.spring.repositories.bill.mssql.dao.TBillLogDao;
import org.example.spring.repositories.bill.mssql.repository.TBillLogRepository;
import org.example.spring.repositories.bill.mssql.table.dto.TBillLogDTO;
import org.example.spring.repositories.bill.mssql.table.po.TBillLog;
import org.example.spring.repositories.bill.mssql.table.query.TBillLogQuery;
import org.example.spring.repositories.bill.mssql.table.vo.TBillLogVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillLogRepositoryImpl extends IBaseRepositoryImpl<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery, TBillLogConverter, TBillLogDao> implements TBillLogRepository {
}