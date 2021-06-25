package org.example.spring.repositories.clients.dubbo.customer.api;


import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerOrderDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerOrder;
import org.example.spring.repositories.commons.entity.customer.query.CustomerOrderQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerOrderVo;

public interface CustomerOrderDubboRepository extends CommonsDubboRepository<CustomerOrder, CustomerOrderVo, CustomerOrderDTO, CustomerOrderQuery> {
}
