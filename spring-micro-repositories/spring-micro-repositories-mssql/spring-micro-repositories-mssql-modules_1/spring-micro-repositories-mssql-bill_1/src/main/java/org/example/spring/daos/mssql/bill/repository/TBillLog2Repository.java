package org.example.spring.daos.mssql.bill.repository;

import org.example.spring.daos.mssql.bill.table.dto.TBillLogDTO;
import org.example.spring.daos.mssql.bill.table.po.TBillLog;
import org.example.spring.daos.mssql.bill.table.query.TBillLogQuery;
import org.example.spring.daos.mssql.bill.table.vo.TBillLogVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TBillLog2Repository extends IBaseRepository<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
}
