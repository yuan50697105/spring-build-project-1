package org.example.spring.repositories.clients.dubbo.customer.api;


import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.customer.dto.PotentialCustomersDTO;
import org.example.spring.repositories.commons.entity.customer.po.PotentialCustomers;
import org.example.spring.repositories.commons.entity.customer.query.PotentialCustomersQuery;
import org.example.spring.repositories.commons.entity.customer.vo.PotentialCustomersVo;

public interface PotentialCustomersDubboRepository extends CommonsDubboRepository<PotentialCustomers, PotentialCustomersVo, PotentialCustomersDTO, PotentialCustomersQuery> {
}
