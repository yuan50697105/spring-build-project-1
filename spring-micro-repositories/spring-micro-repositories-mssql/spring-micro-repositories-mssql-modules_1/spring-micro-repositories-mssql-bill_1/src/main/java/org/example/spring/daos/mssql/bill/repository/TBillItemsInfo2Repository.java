package org.example.spring.daos.mssql.bill.repository;

import org.example.spring.daos.mssql.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.daos.mssql.bill.table.po.TBillItemsInfo;
import org.example.spring.daos.mssql.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.daos.mssql.bill.table.vo.TBillItemsInfoVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TBillItemsInfo2Repository extends IBaseRepository<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
}
