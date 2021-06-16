package org.example.spring.repositories.clients.customer.postgres.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.customer.api.CustomerContractRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerContractDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerContract;
import org.example.spring.repositories.commons.entity.customer.query.CustomerContractQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerContractVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.customer.clients.CustomerContractRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class CustomerContractRepositoryController extends CommonsFeignClientImpl<CustomerContract, CustomerContractVo, CustomerContractDTO, CustomerContractQuery, CustomerContractRepository> implements CustomerContractRepositoryClient {
    public CustomerContractRepositoryController(CustomerContractRepository repository) {
        super(repository);
    }
}