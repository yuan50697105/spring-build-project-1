package org.example.spring.repositories.clients.customer.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.customer.dto.PotentialCustomersDTO;
import org.example.spring.repositories.commons.entity.customer.po.PotentialCustomers;
import org.example.spring.repositories.commons.entity.customer.query.PotentialCustomersQuery;
import org.example.spring.repositories.commons.entity.customer.vo.PotentialCustomersVo;

public interface PotentialCustomersRepository extends CommonsRepository<PotentialCustomers, PotentialCustomersVo, PotentialCustomersDTO, PotentialCustomersQuery> {
}
