package org.example.spring.models.customer.repository;

import org.example.spring.models.customer.entity.query.CustomerQuery;
import org.example.spring.models.customer.entity.result.Customer;
import org.example.spring.models.customer.entity.result.CustomerDetails;
import org.example.spring.models.customer.entity.vo.CustomerFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface CustomerRepository extends IBaseRepository<Customer, CustomerFormVo, CustomerDetails, CustomerQuery> {
}
