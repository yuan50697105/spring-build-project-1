package org.example.spring.repositories.aggregation.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.aggregation.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.aggregation.bill.table.po.TBillItemsInfo;
import org.example.spring.repositories.aggregation.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.aggregation.bill.table.vo.TBillItemsInfoVo;

public interface TBillItemsInfoRepository extends IBaseRepository<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
}
