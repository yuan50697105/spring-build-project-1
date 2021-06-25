package org.example.spring.repositories.bill.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.oracle.table.dto.TBillLogDTO;
import org.example.spring.repositories.bill.oracle.table.po.TBillLog;
import org.example.spring.repositories.bill.oracle.table.query.TBillLogQuery;
import org.example.spring.repositories.bill.oracle.table.vo.TBillLogVo;

public interface TBillLogRepository extends IBaseRepository<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
}
