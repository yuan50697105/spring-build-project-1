package org.example.spring.repositories.bill.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.postgres.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.bill.postgres.table.po.TBillItemsInfo;
import org.example.spring.repositories.bill.postgres.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.bill.postgres.table.vo.TBillItemsInfoVo;

public interface TBillItemsInfoRepository extends IBaseRepository<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
}
