package org.example.spring.repositories.bill.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.mysql.converter.TBillLogConverter;
import org.example.spring.repositories.bill.mysql.dao.TBillLogDao;
import org.example.spring.repositories.bill.mysql.repository.TBillLogRepository;
import org.example.spring.repositories.bill.mysql.table.dto.TBillLogDTO;
import org.example.spring.repositories.bill.mysql.table.po.TBillLog;
import org.example.spring.repositories.bill.mysql.table.query.TBillLogQuery;
import org.example.spring.repositories.bill.mysql.table.vo.TBillLogVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillLogRepositoryImpl extends IBaseRepositoryImpl<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery, TBillLogConverter, TBillLogDao> implements TBillLogRepository {
}