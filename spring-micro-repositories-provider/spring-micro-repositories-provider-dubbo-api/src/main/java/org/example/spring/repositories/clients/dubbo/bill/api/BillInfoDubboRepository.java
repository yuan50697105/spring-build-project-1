package org.example.spring.repositories.clients.dubbo.bill.api;


import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.bill.dto.BillInfoDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillInfo;
import org.example.spring.repositories.commons.entity.bill.query.BillInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillInfoVo;

public interface BillInfoDubboRepository extends CommonsDubboRepository<BillInfo, BillInfoVo, BillInfoDTO, BillInfoQuery> {
}
