package org.example.spring.repositories.feign.customer.clients;


import org.example.spring.repositories.commons.entity.customer.dto.CustomerInfoDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerInfo;
import org.example.spring.repositories.commons.entity.customer.query.CustomerInfoQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerInfoVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("customer/info/repository/client")
public interface CustomerInfoRepositoryClient extends CommonsFeignClient<CustomerInfo, CustomerInfoVo, CustomerInfoDTO, CustomerInfoQuery> {

}
