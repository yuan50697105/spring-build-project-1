package org.example.spring.repositories.customer.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.postgres.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.customer.postgres.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.postgres.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TPotentialCustomersVo;

public interface TPotentialCustomersRepository extends IBaseRepository<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery> {
}
