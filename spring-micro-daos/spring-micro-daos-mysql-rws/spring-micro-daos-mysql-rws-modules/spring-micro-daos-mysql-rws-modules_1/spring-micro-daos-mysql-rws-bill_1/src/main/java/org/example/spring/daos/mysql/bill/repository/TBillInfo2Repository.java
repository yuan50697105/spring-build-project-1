package org.example.spring.daos.mysql.bill.repository;

import org.example.spring.daos.mysql.bill.table.dto.TBillInfoDTO;
import org.example.spring.daos.mysql.bill.table.po.TBillInfo;
import org.example.spring.daos.mysql.bill.table.query.TBillInfoQuery;
import org.example.spring.daos.mysql.bill.table.vo.TBillInfoVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TBillInfo2Repository extends IBaseRepository<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery> {
}