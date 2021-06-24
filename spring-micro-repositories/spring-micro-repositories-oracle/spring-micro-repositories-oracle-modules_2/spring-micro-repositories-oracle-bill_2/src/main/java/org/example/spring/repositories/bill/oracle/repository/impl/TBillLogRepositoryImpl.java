package org.example.spring.repositories.bill.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.oracle.converter.TBillLogConverter;
import org.example.spring.repositories.bill.oracle.dao.TBillLogDao;
import org.example.spring.repositories.bill.oracle.repository.TBillLogRepository;
import org.example.spring.repositories.bill.oracle.table.dto.TBillLogDTO;
import org.example.spring.repositories.bill.oracle.table.po.TBillLog;
import org.example.spring.repositories.bill.oracle.table.query.TBillLogQuery;
import org.example.spring.repositories.bill.oracle.table.vo.TBillLogVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillLogRepositoryImpl extends IBaseRepositoryImpl<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery, TBillLogConverter, TBillLogDao> implements TBillLogRepository {
}