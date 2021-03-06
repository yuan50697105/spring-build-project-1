package org.example.spring.repositories.bill.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.mysql.table.dto.TBillInfoDTO;
import org.example.spring.repositories.bill.mysql.table.po.TBillInfo;
import org.example.spring.repositories.bill.mysql.table.query.TBillInfoQuery;
import org.example.spring.repositories.bill.mysql.table.vo.TBillInfoVo;

public interface TBillInfoRepository extends IBaseRepository<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery> {
}
