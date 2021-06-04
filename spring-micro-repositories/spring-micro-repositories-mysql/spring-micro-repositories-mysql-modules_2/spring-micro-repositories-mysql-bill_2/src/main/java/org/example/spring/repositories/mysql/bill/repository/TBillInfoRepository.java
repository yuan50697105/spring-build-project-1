package org.example.spring.repositories.mysql.bill.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.bill.table.dto.TBillInfoDTO;
import org.example.spring.repositories.mysql.bill.table.po.TBillInfo;
import org.example.spring.repositories.mysql.bill.table.query.TBillInfoQuery;
import org.example.spring.repositories.mysql.bill.table.vo.TBillInfoVo;

public interface TBillInfoRepository extends IBaseRepository<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery> {
}
