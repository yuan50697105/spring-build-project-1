package org.example.spring.repositories.aggregation.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.aggregation.bill.table.dto.TBillInfoDTO;
import org.example.spring.repositories.aggregation.bill.table.po.TBillInfo;
import org.example.spring.repositories.aggregation.bill.table.query.TBillInfoQuery;
import org.example.spring.repositories.aggregation.bill.table.vo.TBillInfoVo;

public interface TBillInfoRepository extends IBaseRepository<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery> {
}
