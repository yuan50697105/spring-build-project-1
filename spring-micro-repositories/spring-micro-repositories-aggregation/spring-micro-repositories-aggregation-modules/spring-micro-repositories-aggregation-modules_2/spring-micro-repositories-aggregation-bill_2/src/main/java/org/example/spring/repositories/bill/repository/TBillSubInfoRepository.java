package org.example.spring.repositories.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.bill.table.po.TBillSubInfo;
import org.example.spring.repositories.bill.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.bill.table.vo.TBillSubInfoVo;

public interface TBillSubInfoRepository extends IBaseRepository<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery> {
}
