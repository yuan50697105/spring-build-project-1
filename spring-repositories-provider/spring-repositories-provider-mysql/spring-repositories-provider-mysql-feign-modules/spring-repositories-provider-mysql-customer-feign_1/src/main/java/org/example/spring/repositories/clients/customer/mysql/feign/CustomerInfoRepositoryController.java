package org.example.spring.repositories.clients.customer.mysql.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.customer.api.CustomerInfoRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerInfoDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerInfo;
import org.example.spring.repositories.commons.entity.customer.query.CustomerInfoQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerInfoVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.customer.clients.CustomerInfoRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class CustomerInfoRepositoryController extends CommonsFeignClientImpl<CustomerInfo, CustomerInfoVo, CustomerInfoDTO, CustomerInfoQuery, CustomerInfoRepository> implements CustomerInfoRepositoryClient {
    public CustomerInfoRepositoryController(CustomerInfoRepository repository) {
        super(repository);
    }
}