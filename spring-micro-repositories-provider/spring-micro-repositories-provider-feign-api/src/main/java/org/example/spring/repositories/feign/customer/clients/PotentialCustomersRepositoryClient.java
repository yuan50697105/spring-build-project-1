package org.example.spring.repositories.feign.customer.clients;


import org.example.spring.repositories.commons.entity.customer.dto.CustomerOrderDTO;
import org.example.spring.repositories.commons.entity.customer.dto.PotentialCustomersDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerOrder;
import org.example.spring.repositories.commons.entity.customer.po.PotentialCustomers;
import org.example.spring.repositories.commons.entity.customer.query.CustomerOrderQuery;
import org.example.spring.repositories.commons.entity.customer.query.PotentialCustomersQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerOrderVo;
import org.example.spring.repositories.commons.entity.customer.vo.PotentialCustomersVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("potential/customers/repository/client")
public interface PotentialCustomersRepositoryClient extends CommonsFeignClient<PotentialCustomers, PotentialCustomersVo, PotentialCustomersDTO, PotentialCustomersQuery> {

}
