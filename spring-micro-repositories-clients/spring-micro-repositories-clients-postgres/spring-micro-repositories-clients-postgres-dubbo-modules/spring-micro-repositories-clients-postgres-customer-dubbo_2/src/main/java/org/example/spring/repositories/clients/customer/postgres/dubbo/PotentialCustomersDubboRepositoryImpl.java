package org.example.spring.repositories.clients.customer.postgres.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.customer.api.PotentialCustomersRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.customer.api.PotentialCustomersDubboRepository;
import org.example.spring.repositories.commons.entity.customer.dto.PotentialCustomersDTO;
import org.example.spring.repositories.commons.entity.customer.po.PotentialCustomers;
import org.example.spring.repositories.commons.entity.customer.query.PotentialCustomersQuery;
import org.example.spring.repositories.commons.entity.customer.vo.PotentialCustomersVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class PotentialCustomersDubboRepositoryImpl extends CommonsDubboRepositoryImpl<PotentialCustomers, PotentialCustomersVo, PotentialCustomersDTO, PotentialCustomersQuery, PotentialCustomersRepository> implements PotentialCustomersDubboRepository {
    protected PotentialCustomersDubboRepositoryImpl(PotentialCustomersRepository repository) {
        super(repository);
    }
}