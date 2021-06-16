package org.example.spring.repositories.feign.bill.clients;


import org.example.spring.repositories.commons.entity.bill.dto.BillItemsInfoDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillItemsInfo;
import org.example.spring.repositories.commons.entity.bill.query.BillItemsInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillItemsInfoVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("bill/items/info/repository/client")
public interface BillItemsInfoRepositoryClient extends CommonsFeignClient<BillItemsInfo, BillItemsInfoVo, BillItemsInfoDTO, BillItemsInfoQuery> {

}
