package org.example.spring.repositories.bill.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.mssql.table.dto.TBillLogDTO;
import org.example.spring.repositories.bill.mssql.table.po.TBillLog;
import org.example.spring.repositories.bill.mssql.table.query.TBillLogQuery;
import org.example.spring.repositories.bill.mssql.table.vo.TBillLogVo;

public interface TBillLogRepository extends IBaseRepository<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
}
