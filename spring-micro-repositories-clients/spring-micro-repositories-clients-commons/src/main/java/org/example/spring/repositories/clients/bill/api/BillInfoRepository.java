package org.example.spring.repositories.clients.bill.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.bill.dto.BillInfoDTO;
import org.example.spring.repositories.commons.bill.po.BillInfo;
import org.example.spring.repositories.commons.bill.query.BillInfoQuery;
import org.example.spring.repositories.commons.bill.vo.BillInfoVo;

public interface BillInfoRepository extends CommonsRepository<BillInfo, BillInfoVo, BillInfoDTO, BillInfoQuery> {
}
