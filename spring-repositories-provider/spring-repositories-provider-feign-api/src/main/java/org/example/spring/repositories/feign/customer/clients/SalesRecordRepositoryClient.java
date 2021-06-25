package org.example.spring.repositories.feign.customer.clients;


import org.example.spring.repositories.commons.entity.customer.dto.SalesRecordDTO;
import org.example.spring.repositories.commons.entity.customer.po.SalesRecord;
import org.example.spring.repositories.commons.entity.customer.query.SalesRecordQuery;
import org.example.spring.repositories.commons.entity.customer.vo.SalesRecordVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("sales/record/repository/client")
public interface SalesRecordRepositoryClient extends CommonsFeignClient<SalesRecord, SalesRecordVo, SalesRecordDTO, SalesRecordQuery> {

}
