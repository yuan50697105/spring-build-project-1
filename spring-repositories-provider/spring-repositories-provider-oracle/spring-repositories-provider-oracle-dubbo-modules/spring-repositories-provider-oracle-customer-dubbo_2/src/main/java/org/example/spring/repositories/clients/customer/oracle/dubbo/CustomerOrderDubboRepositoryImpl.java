package org.example.spring.repositories.clients.customer.oracle.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.customer.api.CustomerOrderRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.customer.api.CustomerOrderDubboRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerOrderDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerOrder;
import org.example.spring.repositories.commons.entity.customer.query.CustomerOrderQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerOrderVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class CustomerOrderDubboRepositoryImpl extends CommonsDubboRepositoryImpl<CustomerOrder, CustomerOrderVo, CustomerOrderDTO, CustomerOrderQuery, CustomerOrderRepository> implements CustomerOrderDubboRepository {
    protected CustomerOrderDubboRepositoryImpl(CustomerOrderRepository repository) {
        super(repository);
    }
}