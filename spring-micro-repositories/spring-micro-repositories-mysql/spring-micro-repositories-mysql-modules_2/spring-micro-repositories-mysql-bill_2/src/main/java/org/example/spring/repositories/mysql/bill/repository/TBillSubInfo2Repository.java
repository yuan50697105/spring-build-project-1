package org.example.spring.repositories.mysql.bill.repository;

import org.example.spring.daos.mysql.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.daos.mysql.bill.table.po.TBillSubInfo;
import org.example.spring.daos.mysql.bill.table.query.TBillSubInfoQuery;
import org.example.spring.daos.mysql.bill.table.vo.TBillSubInfoVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.mysql.bill.table.po.TBillSubInfo;
import org.example.spring.repositories.mysql.bill.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.mysql.bill.table.vo.TBillSubInfoVo;

public interface TBillSubInfo2Repository extends IBaseRepository<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery> {
}
