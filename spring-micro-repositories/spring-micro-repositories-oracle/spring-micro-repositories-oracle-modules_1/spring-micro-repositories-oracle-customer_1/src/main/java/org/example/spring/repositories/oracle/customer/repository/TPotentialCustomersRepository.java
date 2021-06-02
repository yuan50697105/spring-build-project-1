package org.example.spring.repositories.oracle.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.customer.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.oracle.customer.table.po.TPotentialCustomers;
import org.example.spring.repositories.oracle.customer.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.oracle.customer.table.vo.TPotentialCustomersVo;

public interface TPotentialCustomersRepository extends IBaseRepository<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery> {
}
