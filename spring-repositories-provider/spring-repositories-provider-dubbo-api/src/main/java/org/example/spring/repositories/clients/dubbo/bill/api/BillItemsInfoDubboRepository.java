package org.example.spring.repositories.clients.dubbo.bill.api;


import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.bill.dto.BillItemsInfoDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillItemsInfo;
import org.example.spring.repositories.commons.entity.bill.query.BillItemsInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillItemsInfoVo;

public interface BillItemsInfoDubboRepository extends CommonsDubboRepository<BillItemsInfo, BillItemsInfoVo, BillItemsInfoDTO, BillItemsInfoQuery> {
}
