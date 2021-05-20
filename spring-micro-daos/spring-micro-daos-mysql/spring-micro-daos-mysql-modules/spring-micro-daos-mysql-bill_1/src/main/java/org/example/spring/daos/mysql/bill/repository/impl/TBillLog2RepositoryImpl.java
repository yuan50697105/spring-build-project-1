package org.example.spring.daos.mysql.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.bill.converter.TBillLogConverter;
import org.example.spring.daos.mysql.bill.dao.TBillLogDao;
import org.example.spring.daos.mysql.bill.repository.TBillLog2Repository;
import org.example.spring.daos.mysql.bill.table.dto.TBillLogDTO;
import org.example.spring.daos.mysql.bill.table.po.TBillLog;
import org.example.spring.daos.mysql.bill.table.query.TBillLogQuery;
import org.example.spring.daos.mysql.bill.table.vo.TBillLogVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillLog2RepositoryImpl extends IBaseRepositoryImpl<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery, TBillLogConverter, TBillLogDao> implements TBillLog2Repository {
}