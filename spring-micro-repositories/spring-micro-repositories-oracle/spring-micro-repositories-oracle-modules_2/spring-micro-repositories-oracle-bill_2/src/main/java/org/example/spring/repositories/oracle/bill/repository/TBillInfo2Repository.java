package org.example.spring.repositories.oracle.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.bill.table.dto.TBillInfoDTO;
import org.example.spring.repositories.oracle.bill.table.po.TBillInfo;
import org.example.spring.repositories.oracle.bill.table.query.TBillInfoQuery;
import org.example.spring.repositories.oracle.bill.table.vo.TBillInfoVo;

public interface TBillInfo2Repository extends IBaseRepository<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery> {
}
