package org.example.spring.repositories.customer.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.mssql.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.customer.mssql.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.mssql.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TPotentialCustomersVo;

public interface TPotentialCustomersRepository extends IBaseRepository<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery> {
}
