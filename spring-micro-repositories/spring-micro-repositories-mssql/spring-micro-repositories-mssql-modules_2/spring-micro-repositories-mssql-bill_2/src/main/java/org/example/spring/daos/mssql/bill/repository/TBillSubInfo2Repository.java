package org.example.spring.daos.mssql.bill.repository;

import org.example.spring.daos.mssql.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.daos.mssql.bill.table.po.TBillSubInfo;
import org.example.spring.daos.mssql.bill.table.query.TBillSubInfoQuery;
import org.example.spring.daos.mssql.bill.table.vo.TBillSubInfoVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TBillSubInfo2Repository extends IBaseRepository<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery> {
}
