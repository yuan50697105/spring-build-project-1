package org.example.spring.repositories.bill.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.mysql.table.dto.TBillLogDTO;
import org.example.spring.repositories.bill.mysql.table.po.TBillLog;
import org.example.spring.repositories.bill.mysql.table.query.TBillLogQuery;
import org.example.spring.repositories.bill.mysql.table.vo.TBillLogVo;

public interface TBillLogRepository extends IBaseRepository<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
}
