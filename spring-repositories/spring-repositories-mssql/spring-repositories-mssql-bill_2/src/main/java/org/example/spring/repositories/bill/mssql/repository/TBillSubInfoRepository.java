package org.example.spring.repositories.bill.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.mssql.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.bill.mssql.table.po.TBillSubInfo;
import org.example.spring.repositories.bill.mssql.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.bill.mssql.table.vo.TBillSubInfoVo;

public interface TBillSubInfoRepository extends IBaseRepository<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery> {
}
