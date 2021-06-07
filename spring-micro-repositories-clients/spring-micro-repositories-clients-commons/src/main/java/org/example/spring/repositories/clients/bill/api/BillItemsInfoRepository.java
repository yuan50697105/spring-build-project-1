package org.example.spring.repositories.clients.bill.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.bill.dto.BillItemsInfoDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillItemsInfo;
import org.example.spring.repositories.commons.entity.bill.query.BillItemsInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillItemsInfoVo;

public interface BillItemsInfoRepository extends CommonsRepository<BillItemsInfo, BillItemsInfoVo, BillItemsInfoDTO, BillItemsInfoQuery> {
}
