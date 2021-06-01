package org.example.spring.repositories.mssql.bill.repository;

import org.example.spring.repositories.mssql.bill.table.dto.TBillInfoDTO;
import org.example.spring.repositories.mssql.bill.table.po.TBillInfo;
import org.example.spring.repositories.mssql.bill.table.query.TBillInfoQuery;
import org.example.spring.repositories.mssql.bill.table.vo.TBillInfoVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TBillInfo2Repository extends IBaseRepository<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery> {
}
