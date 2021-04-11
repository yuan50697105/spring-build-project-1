package org.example.spring.infrastructures.mysql.customer.repository;

import org.example.spring.infrastructures.mysql.customer.entity.query.CustomerQuery;
import org.example.spring.infrastructures.mysql.customer.entity.result.Customer;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerDetails;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface CustomerRepository extends IBaseRepository<Customer, CustomerFormVo, CustomerDetails, CustomerQuery> {
}
