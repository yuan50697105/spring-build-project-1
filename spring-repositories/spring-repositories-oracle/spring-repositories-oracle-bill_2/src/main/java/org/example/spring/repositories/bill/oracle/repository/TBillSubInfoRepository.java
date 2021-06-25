package org.example.spring.repositories.bill.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.oracle.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.bill.oracle.table.po.TBillSubInfo;
import org.example.spring.repositories.bill.oracle.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.bill.oracle.table.vo.TBillSubInfoVo;

public interface TBillSubInfoRepository extends IBaseRepository<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery> {
}
