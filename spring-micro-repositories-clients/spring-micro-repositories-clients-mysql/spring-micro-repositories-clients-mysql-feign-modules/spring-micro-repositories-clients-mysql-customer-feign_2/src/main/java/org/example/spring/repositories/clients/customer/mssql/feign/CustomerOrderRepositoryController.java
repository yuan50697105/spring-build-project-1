package org.example.spring.repositories.clients.customer.mssql.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.customer.api.CustomerOrderRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerOrderDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerOrder;
import org.example.spring.repositories.commons.entity.customer.query.CustomerOrderQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerOrderVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.customer.clients.CustomerOrderRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class CustomerOrderRepositoryController extends CommonsFeignClientImpl<CustomerOrder, CustomerOrderVo, CustomerOrderDTO, CustomerOrderQuery, CustomerOrderRepository> implements CustomerOrderRepositoryClient {
    public CustomerOrderRepositoryController(CustomerOrderRepository repository) {
        super(repository);
    }
}