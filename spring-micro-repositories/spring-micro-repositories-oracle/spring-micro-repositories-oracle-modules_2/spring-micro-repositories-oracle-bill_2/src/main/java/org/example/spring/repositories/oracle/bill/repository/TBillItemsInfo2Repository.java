package org.example.spring.repositories.oracle.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.oracle.bill.table.po.TBillItemsInfo;
import org.example.spring.repositories.oracle.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.oracle.bill.table.vo.TBillItemsInfoVo;

public interface TBillItemsInfo2Repository extends IBaseRepository<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
}
