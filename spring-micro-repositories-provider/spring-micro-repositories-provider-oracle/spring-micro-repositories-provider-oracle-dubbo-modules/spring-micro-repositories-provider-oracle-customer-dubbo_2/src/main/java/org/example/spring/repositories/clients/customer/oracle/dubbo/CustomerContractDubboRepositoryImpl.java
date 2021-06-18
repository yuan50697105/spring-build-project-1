package org.example.spring.repositories.clients.customer.oracle.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.customer.api.CustomerContractRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.customer.api.CustomerContractDubboRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerContractDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerContract;
import org.example.spring.repositories.commons.entity.customer.query.CustomerContractQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerContractVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class CustomerContractDubboRepositoryImpl extends CommonsDubboRepositoryImpl<CustomerContract, CustomerContractVo, CustomerContractDTO, CustomerContractQuery, CustomerContractRepository> implements CustomerContractDubboRepository {
    protected CustomerContractDubboRepositoryImpl(CustomerContractRepository repository) {
        super(repository);
    }
}