package org.example.spring.repositories.bill.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.oracle.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.bill.oracle.table.po.TBillItemsInfo;
import org.example.spring.repositories.bill.oracle.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.bill.oracle.table.vo.TBillItemsInfoVo;

public interface TBillItemsInfoRepository extends IBaseRepository<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
}
