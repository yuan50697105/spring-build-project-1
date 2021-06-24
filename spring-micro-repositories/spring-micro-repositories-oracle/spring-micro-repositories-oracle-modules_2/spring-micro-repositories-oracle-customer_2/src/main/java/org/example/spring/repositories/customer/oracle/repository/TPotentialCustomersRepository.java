package org.example.spring.repositories.customer.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.oracle.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.customer.oracle.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.oracle.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.customer.oracle.table.vo.TPotentialCustomersVo;

public interface TPotentialCustomersRepository extends IBaseRepository<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery> {
}
