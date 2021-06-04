package org.example.spring.repositories.postgres.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.postgres.bill.table.dto.TBillInfoDTO;
import org.example.spring.repositories.postgres.bill.table.po.TBillInfo;
import org.example.spring.repositories.postgres.bill.table.query.TBillInfoQuery;
import org.example.spring.repositories.postgres.bill.table.vo.TBillInfoVo;

public interface TBillInfoRepository extends IBaseRepository<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery> {
}
