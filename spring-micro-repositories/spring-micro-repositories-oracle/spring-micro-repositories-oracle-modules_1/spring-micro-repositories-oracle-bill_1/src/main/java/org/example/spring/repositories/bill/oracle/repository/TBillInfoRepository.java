package org.example.spring.repositories.bill.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.oracle.table.dto.TBillInfoDTO;
import org.example.spring.repositories.bill.oracle.table.po.TBillInfo;
import org.example.spring.repositories.bill.oracle.table.query.TBillInfoQuery;
import org.example.spring.repositories.bill.oracle.table.vo.TBillInfoVo;

public interface TBillInfoRepository extends IBaseRepository<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery> {
}
