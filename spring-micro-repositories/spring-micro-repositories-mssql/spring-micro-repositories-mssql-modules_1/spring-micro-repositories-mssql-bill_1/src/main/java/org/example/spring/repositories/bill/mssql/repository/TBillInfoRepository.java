package org.example.spring.repositories.bill.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.mssql.table.dto.TBillInfoDTO;
import org.example.spring.repositories.bill.mssql.table.po.TBillInfo;
import org.example.spring.repositories.bill.mssql.table.query.TBillInfoQuery;
import org.example.spring.repositories.bill.mssql.table.vo.TBillInfoVo;

public interface TBillInfoRepository extends IBaseRepository<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery> {
}
