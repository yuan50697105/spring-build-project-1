package org.example.spring.repositories.feign.bill.clients;


import org.example.spring.repositories.commons.entity.bill.dto.BillInfoDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillInfo;
import org.example.spring.repositories.commons.entity.bill.query.BillInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillInfoVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("bill/info/repository/client")
public interface BillInfoRepositoryClient extends CommonsFeignClient<BillInfo, BillInfoVo, BillInfoDTO, BillInfoQuery> {

}
