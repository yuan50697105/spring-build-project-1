package org.example.spring.repositories.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.table.dto.TBillInfoDTO;
import org.example.spring.repositories.bill.table.po.TBillInfo;
import org.example.spring.repositories.bill.table.query.TBillInfoQuery;
import org.example.spring.repositories.bill.table.vo.TBillInfoVo;

public interface TBillInfoRepository extends IBaseRepository<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery> {
}
