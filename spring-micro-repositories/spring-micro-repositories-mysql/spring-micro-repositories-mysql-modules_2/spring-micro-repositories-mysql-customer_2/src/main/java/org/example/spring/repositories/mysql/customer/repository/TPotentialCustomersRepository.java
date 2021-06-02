package org.example.spring.repositories.mysql.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.customer.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.mysql.customer.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerOrder;
import org.example.spring.repositories.mysql.customer.table.po.TPotentialCustomers;
import org.example.spring.repositories.mysql.customer.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.mysql.customer.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TCustomerOrderVo;
import org.example.spring.repositories.mysql.customer.table.vo.TPotentialCustomersVo;

public interface TPotentialCustomersRepository extends IBaseRepository<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery> {
}
