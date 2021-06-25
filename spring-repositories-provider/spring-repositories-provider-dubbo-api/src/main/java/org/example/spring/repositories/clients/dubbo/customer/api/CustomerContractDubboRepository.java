package org.example.spring.repositories.clients.dubbo.customer.api;


import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerContractDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerContract;
import org.example.spring.repositories.commons.entity.customer.query.CustomerContractQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerContractVo;

public interface CustomerContractDubboRepository extends CommonsDubboRepository<CustomerContract, CustomerContractVo, CustomerContractDTO, CustomerContractQuery> {
}
