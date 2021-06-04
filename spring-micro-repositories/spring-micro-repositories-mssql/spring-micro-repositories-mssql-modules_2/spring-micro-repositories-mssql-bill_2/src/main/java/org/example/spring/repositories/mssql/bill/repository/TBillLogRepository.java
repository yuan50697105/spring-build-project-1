package org.example.spring.repositories.mssql.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mssql.bill.table.dto.TBillLogDTO;
import org.example.spring.repositories.mssql.bill.table.po.TBillLog;
import org.example.spring.repositories.mssql.bill.table.query.TBillLogQuery;
import org.example.spring.repositories.mssql.bill.table.vo.TBillLogVo;

public interface TBillLogRepository extends IBaseRepository<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
}
