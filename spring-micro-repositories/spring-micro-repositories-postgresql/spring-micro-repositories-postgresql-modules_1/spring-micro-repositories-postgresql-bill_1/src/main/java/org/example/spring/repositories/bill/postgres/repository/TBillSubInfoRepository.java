package org.example.spring.repositories.bill.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.postgres.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.bill.postgres.table.po.TBillSubInfo;
import org.example.spring.repositories.bill.postgres.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.bill.postgres.table.vo.TBillSubInfoVo;

public interface TBillSubInfoRepository extends IBaseRepository<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery> {
}
