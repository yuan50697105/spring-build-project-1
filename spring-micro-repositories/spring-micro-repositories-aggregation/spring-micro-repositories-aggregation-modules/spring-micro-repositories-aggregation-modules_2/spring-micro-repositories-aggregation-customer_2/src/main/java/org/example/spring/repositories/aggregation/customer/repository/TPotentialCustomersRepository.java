package org.example.spring.repositories.aggregation.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.aggregation.customer.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.aggregation.customer.table.po.TPotentialCustomers;
import org.example.spring.repositories.aggregation.customer.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.aggregation.customer.table.vo.TPotentialCustomersVo;

public interface TPotentialCustomersRepository extends IBaseRepository<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery> {
}
