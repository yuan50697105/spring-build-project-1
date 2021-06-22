package org.example.spring.repositories.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.table.dto.TBillLogDTO;
import org.example.spring.repositories.bill.table.po.TBillLog;
import org.example.spring.repositories.bill.table.query.TBillLogQuery;
import org.example.spring.repositories.bill.table.vo.TBillLogVo;

public interface TBillLogRepository extends IBaseRepository<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
}
