package org.example.spring.repositories.clients.dubbo.bill.api;


import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.bill.dto.BillSubInfoDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillSubInfo;
import org.example.spring.repositories.commons.entity.bill.query.BillSubInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillSubInfoVo;

public interface BillSubInfoDubboRepository extends CommonsDubboRepository<BillSubInfo, BillSubInfoVo, BillSubInfoDTO, BillSubInfoQuery> {
}
