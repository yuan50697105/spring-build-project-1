package org.example.spring.repositories.mssql.bill.repository;

import org.example.spring.repositories.mssql.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.mssql.bill.table.po.TBillItemsInfo;
import org.example.spring.repositories.mssql.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.mssql.bill.table.vo.TBillItemsInfoVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TBillItemsInfo2Repository extends IBaseRepository<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
}
