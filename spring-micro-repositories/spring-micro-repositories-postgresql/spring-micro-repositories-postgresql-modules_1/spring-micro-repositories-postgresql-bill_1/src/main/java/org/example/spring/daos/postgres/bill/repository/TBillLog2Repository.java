package org.example.spring.daos.postgres.bill.repository;

import org.example.spring.daos.postgres.bill.table.dto.TBillLogDTO;
import org.example.spring.daos.postgres.bill.table.po.TBillLog;
import org.example.spring.daos.postgres.bill.table.query.TBillLogQuery;
import org.example.spring.daos.postgres.bill.table.vo.TBillLogVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TBillLog2Repository extends IBaseRepository<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
}
