package org.example.spring.models.postgresql.customer.repository;

import org.example.spring.models.commons.repository.IBaseRepository;
import org.example.spring.models.postgresql.customer.entity.query.CustomerQuery;
import org.example.spring.models.postgresql.customer.entity.result.Customer;
import org.example.spring.models.postgresql.customer.entity.result.CustomerDetails;
import org.example.spring.models.postgresql.customer.entity.vo.CustomerModelVo;

public interface CustomerRepository extends IBaseRepository<Customer, CustomerModelVo, CustomerDetails, CustomerQuery> {
}
