package org.example.spring.repositories.clients.customer.postgres.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.customer.api.PotentialCustomersRepository;
import org.example.spring.repositories.commons.entity.customer.dto.PotentialCustomersDTO;
import org.example.spring.repositories.commons.entity.customer.po.PotentialCustomers;
import org.example.spring.repositories.commons.entity.customer.query.PotentialCustomersQuery;
import org.example.spring.repositories.commons.entity.customer.vo.PotentialCustomersVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.customer.clients.PotentialCustomersRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class PotentialCustomersRepositoryController extends CommonsFeignClientImpl<PotentialCustomers, PotentialCustomersVo, PotentialCustomersDTO, PotentialCustomersQuery, PotentialCustomersRepository> implements PotentialCustomersRepositoryClient {
    public PotentialCustomersRepositoryController(PotentialCustomersRepository repository) {
        super(repository);
    }
}