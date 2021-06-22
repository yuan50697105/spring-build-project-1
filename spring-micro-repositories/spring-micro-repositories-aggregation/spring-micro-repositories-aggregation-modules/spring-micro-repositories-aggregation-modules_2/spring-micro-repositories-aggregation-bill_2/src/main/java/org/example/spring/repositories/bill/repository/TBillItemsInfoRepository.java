package org.example.spring.repositories.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.bill.table.po.TBillItemsInfo;
import org.example.spring.repositories.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.bill.table.vo.TBillItemsInfoVo;

public interface TBillItemsInfoRepository extends IBaseRepository<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
}
