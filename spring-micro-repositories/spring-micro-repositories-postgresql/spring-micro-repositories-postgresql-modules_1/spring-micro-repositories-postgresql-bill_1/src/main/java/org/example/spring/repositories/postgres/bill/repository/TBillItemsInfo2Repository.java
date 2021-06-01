package org.example.spring.repositories.postgres.bill.repository;

import org.example.spring.repositories.postgres.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.postgres.bill.table.po.TBillItemsInfo;
import org.example.spring.repositories.postgres.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.postgres.bill.table.vo.TBillItemsInfoVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TBillItemsInfo2Repository extends IBaseRepository<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
}
