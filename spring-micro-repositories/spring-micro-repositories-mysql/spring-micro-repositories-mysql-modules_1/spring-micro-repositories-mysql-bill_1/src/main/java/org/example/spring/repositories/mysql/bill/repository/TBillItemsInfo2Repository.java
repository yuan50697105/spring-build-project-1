package org.example.spring.repositories.mysql.bill.repository;

import org.example.spring.daos.mysql.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.daos.mysql.bill.table.po.TBillItemsInfo;
import org.example.spring.daos.mysql.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.daos.mysql.bill.table.vo.TBillItemsInfoVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.mysql.bill.table.po.TBillItemsInfo;
import org.example.spring.repositories.mysql.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.mysql.bill.table.vo.TBillItemsInfoVo;

public interface TBillItemsInfo2Repository extends IBaseRepository<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
}
