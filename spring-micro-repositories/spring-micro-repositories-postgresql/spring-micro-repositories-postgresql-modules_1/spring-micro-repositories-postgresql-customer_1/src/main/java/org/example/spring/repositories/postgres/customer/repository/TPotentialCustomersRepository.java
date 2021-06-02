package org.example.spring.repositories.postgres.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.postgres.customer.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.postgres.customer.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.postgres.customer.table.po.TCustomerOrder;
import org.example.spring.repositories.postgres.customer.table.po.TPotentialCustomers;
import org.example.spring.repositories.postgres.customer.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.postgres.customer.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.postgres.customer.table.vo.TCustomerOrderVo;
import org.example.spring.repositories.postgres.customer.table.vo.TPotentialCustomersVo;

public interface TPotentialCustomersRepository extends IBaseRepository<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery> {
}
