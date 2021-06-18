package org.example.spring.repositories.clients.dubbo.customer.api;


import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerContractDTO;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerInfoDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerContract;
import org.example.spring.repositories.commons.entity.customer.po.CustomerInfo;
import org.example.spring.repositories.commons.entity.customer.query.CustomerContractQuery;
import org.example.spring.repositories.commons.entity.customer.query.CustomerInfoQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerContractVo;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerInfoVo;

public interface CustomerInfoDubboRepository extends CommonsDubboRepository<CustomerInfo, CustomerInfoVo, CustomerInfoDTO, CustomerInfoQuery> {
}
