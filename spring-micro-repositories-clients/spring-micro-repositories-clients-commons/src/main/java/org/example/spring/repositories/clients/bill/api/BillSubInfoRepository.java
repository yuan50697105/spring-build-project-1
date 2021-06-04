package org.example.spring.repositories.clients.bill.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.bill.dto.BillSubInfoDTO;
import org.example.spring.repositories.commons.bill.po.BillSubInfo;
import org.example.spring.repositories.commons.bill.query.BillSubInfoQuery;
import org.example.spring.repositories.commons.bill.vo.BillSubInfoVo;

public interface BillSubInfoRepository extends CommonsRepository<BillSubInfo, BillSubInfoVo, BillSubInfoDTO, BillSubInfoQuery> {
}
