package org.example.spring.repositories.mysql.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.bill.converter.TBillLogConverter;
import org.example.spring.repositories.mysql.bill.dao.TBillLogDao;
import org.example.spring.repositories.mysql.bill.repository.TBillLog2Repository;
import org.example.spring.repositories.mysql.bill.table.dto.TBillLogDTO;
import org.example.spring.repositories.mysql.bill.table.po.TBillLog;
import org.example.spring.repositories.mysql.bill.table.query.TBillLogQuery;
import org.example.spring.repositories.mysql.bill.table.vo.TBillLogVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillLog2RepositoryImpl extends IBaseRepositoryImpl<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery, TBillLogConverter, TBillLogDao> implements TBillLog2Repository {
}