package org.example.spring.repositories.feign.customer.clients;


import org.example.spring.repositories.commons.entity.customer.dto.CustomerOrderDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerOrder;
import org.example.spring.repositories.commons.entity.customer.query.CustomerOrderQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerOrderVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("customer/order/repository/client")
public interface CustomerOrderRepositoryClient extends CommonsFeignClient<CustomerOrder, CustomerOrderVo, CustomerOrderDTO, CustomerOrderQuery> {

}
