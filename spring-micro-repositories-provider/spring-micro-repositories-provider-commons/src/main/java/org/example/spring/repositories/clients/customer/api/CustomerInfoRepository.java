package org.example.spring.repositories.clients.customer.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerInfoDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerInfo;
import org.example.spring.repositories.commons.entity.customer.query.CustomerInfoQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerInfoVo;

public interface CustomerInfoRepository extends CommonsRepository<CustomerInfo, CustomerInfoVo, CustomerInfoDTO, CustomerInfoQuery> {
}
