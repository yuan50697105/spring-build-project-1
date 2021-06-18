package org.example.spring.repositories.clients.customer.postgres.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.customer.api.CustomerInfoRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.customer.api.CustomerInfoDubboRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerInfoDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerInfo;
import org.example.spring.repositories.commons.entity.customer.query.CustomerInfoQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerInfoVo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@DubboService
public class CustomerInfoDubboRepositoryImpl extends CommonsDubboRepositoryImpl<CustomerInfo, CustomerInfoVo, CustomerInfoDTO, CustomerInfoQuery, CustomerInfoRepository> implements CustomerInfoDubboRepository {
    protected CustomerInfoDubboRepositoryImpl(CustomerInfoRepository repository) {
        super(repository);
    }
}