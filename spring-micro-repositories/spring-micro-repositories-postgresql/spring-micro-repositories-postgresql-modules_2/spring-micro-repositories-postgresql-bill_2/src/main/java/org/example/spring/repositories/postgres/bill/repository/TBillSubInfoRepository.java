package org.example.spring.repositories.postgres.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.postgres.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.postgres.bill.table.po.TBillSubInfo;
import org.example.spring.repositories.postgres.bill.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.postgres.bill.table.vo.TBillSubInfoVo;

public interface TBillSubInfoRepository extends IBaseRepository<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery> {
}
