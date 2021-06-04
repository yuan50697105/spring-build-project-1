package org.example.spring.repositories.oracle.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.bill.table.dto.TBillLogDTO;
import org.example.spring.repositories.oracle.bill.table.po.TBillLog;
import org.example.spring.repositories.oracle.bill.table.query.TBillLogQuery;
import org.example.spring.repositories.oracle.bill.table.vo.TBillLogVo;

public interface TBillLogRepository extends IBaseRepository<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
}
