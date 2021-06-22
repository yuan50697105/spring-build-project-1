package org.example.spring.repositories.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.converter.TBillLogConverter;
import org.example.spring.repositories.bill.dao.TBillLogDao;
import org.example.spring.repositories.bill.repository.TBillLogRepository;
import org.example.spring.repositories.bill.table.dto.TBillLogDTO;
import org.example.spring.repositories.bill.table.po.TBillLog;
import org.example.spring.repositories.bill.table.query.TBillLogQuery;
import org.example.spring.repositories.bill.table.vo.TBillLogVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillLogRepositoryImpl extends IBaseRepositoryImpl<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery, TBillLogConverter, TBillLogDao> implements TBillLogRepository {
}