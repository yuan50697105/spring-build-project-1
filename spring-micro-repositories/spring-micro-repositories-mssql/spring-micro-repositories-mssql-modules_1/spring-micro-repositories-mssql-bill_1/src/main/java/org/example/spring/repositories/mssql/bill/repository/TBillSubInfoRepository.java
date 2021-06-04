package org.example.spring.repositories.mssql.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mssql.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.mssql.bill.table.po.TBillSubInfo;
import org.example.spring.repositories.mssql.bill.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.mssql.bill.table.vo.TBillSubInfoVo;

public interface TBillSubInfoRepository extends IBaseRepository<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery> {
}
