package org.example.spring.repositories.feign.bill.clients;


import org.example.spring.repositories.commons.entity.bill.dto.BillSubInfoDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillSubInfo;
import org.example.spring.repositories.commons.entity.bill.query.BillSubInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillSubInfoVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("bill/sub/info/repository/client")
public interface BillSubInfoRepositoryClient extends CommonsFeignClient<BillSubInfo, BillSubInfoVo, BillSubInfoDTO, BillSubInfoQuery> {

}
