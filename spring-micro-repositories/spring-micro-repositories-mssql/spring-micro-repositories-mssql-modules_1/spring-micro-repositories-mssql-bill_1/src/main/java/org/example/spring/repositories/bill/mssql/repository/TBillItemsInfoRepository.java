package org.example.spring.repositories.bill.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.mssql.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.bill.mssql.table.po.TBillItemsInfo;
import org.example.spring.repositories.bill.mssql.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.bill.mssql.table.vo.TBillItemsInfoVo;

public interface TBillItemsInfoRepository extends IBaseRepository<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
}
