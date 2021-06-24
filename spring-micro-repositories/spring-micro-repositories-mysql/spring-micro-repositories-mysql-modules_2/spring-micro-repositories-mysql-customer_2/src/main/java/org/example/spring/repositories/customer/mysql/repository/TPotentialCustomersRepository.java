package org.example.spring.repositories.customer.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.mysql.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.customer.mysql.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.mysql.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.customer.mysql.table.vo.TPotentialCustomersVo;

public interface TPotentialCustomersRepository extends IBaseRepository<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery> {
}
