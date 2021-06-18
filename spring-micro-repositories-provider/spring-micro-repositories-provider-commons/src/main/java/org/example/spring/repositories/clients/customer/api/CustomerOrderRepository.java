package org.example.spring.repositories.clients.customer.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerContractDTO;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerOrderDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerContract;
import org.example.spring.repositories.commons.entity.customer.po.CustomerOrder;
import org.example.spring.repositories.commons.entity.customer.query.CustomerContractQuery;
import org.example.spring.repositories.commons.entity.customer.query.CustomerOrderQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerContractVo;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerOrderVo;

public interface CustomerOrderRepository extends CommonsRepository<CustomerOrder, CustomerOrderVo, CustomerOrderDTO, CustomerOrderQuery> {
}
