package org.example.spring.repositories.bill.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.postgres.table.dto.TBillLogDTO;
import org.example.spring.repositories.bill.postgres.table.po.TBillLog;
import org.example.spring.repositories.bill.postgres.table.query.TBillLogQuery;
import org.example.spring.repositories.bill.postgres.table.vo.TBillLogVo;

public interface TBillLogRepository extends IBaseRepository<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
}
