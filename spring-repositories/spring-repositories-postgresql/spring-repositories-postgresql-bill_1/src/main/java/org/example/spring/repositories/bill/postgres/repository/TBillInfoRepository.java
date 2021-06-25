package org.example.spring.repositories.bill.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.postgres.table.dto.TBillInfoDTO;
import org.example.spring.repositories.bill.postgres.table.po.TBillInfo;
import org.example.spring.repositories.bill.postgres.table.query.TBillInfoQuery;
import org.example.spring.repositories.bill.postgres.table.vo.TBillInfoVo;

public interface TBillInfoRepository extends IBaseRepository<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery> {
}
