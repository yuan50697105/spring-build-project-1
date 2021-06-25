package org.example.spring.repositories.bill.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.bill.mysql.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.bill.mysql.table.po.TBillItemsInfo;
import org.example.spring.repositories.bill.mysql.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.bill.mysql.table.vo.TBillItemsInfoVo;

public interface TBillItemsInfoRepository extends IBaseRepository<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
}
