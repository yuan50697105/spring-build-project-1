package org.example.spring.repositories.feign.bill.clients;


import org.example.spring.repositories.commons.entity.bill.dto.BillLogDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillLog;
import org.example.spring.repositories.commons.entity.bill.query.BillLogQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillLogVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("bill/log/repository/client")
public interface BillLogRepositoryClient extends CommonsFeignClient<BillLog, BillLogVo, BillLogDTO, BillLogQuery> {

}
