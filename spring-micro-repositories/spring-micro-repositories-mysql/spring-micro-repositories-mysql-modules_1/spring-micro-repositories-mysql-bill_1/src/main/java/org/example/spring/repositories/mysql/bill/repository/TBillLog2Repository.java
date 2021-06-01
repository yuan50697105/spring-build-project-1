package org.example.spring.repositories.mysql.bill.repository;

import org.example.spring.daos.mysql.bill.table.dto.TBillLogDTO;
import org.example.spring.daos.mysql.bill.table.po.TBillLog;
import org.example.spring.daos.mysql.bill.table.query.TBillLogQuery;
import org.example.spring.daos.mysql.bill.table.vo.TBillLogVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.bill.table.dto.TBillLogDTO;
import org.example.spring.repositories.mysql.bill.table.po.TBillLog;
import org.example.spring.repositories.mysql.bill.table.query.TBillLogQuery;
import org.example.spring.repositories.mysql.bill.table.vo.TBillLogVo;

public interface TBillLog2Repository extends IBaseRepository<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
}
