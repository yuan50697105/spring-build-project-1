package org.example.spring.repositories.oracle.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.oracle.bill.table.po.TBillSubInfo;
import org.example.spring.repositories.oracle.bill.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.oracle.bill.table.vo.TBillSubInfoVo;

public interface TBillSubInfo2Repository extends IBaseRepository<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery> {
}
