package org.example.spring.models.clickhouse.customer.repository;

import org.example.spring.models.clickhouse.customer.entity.query.CustomerQuery;
import org.example.spring.models.clickhouse.customer.entity.result.Customer;
import org.example.spring.models.clickhouse.customer.entity.result.CustomerDetails;
import org.example.spring.models.clickhouse.customer.entity.vo.CustomerModelVo;
import org.example.spring.models.commons.repository.IBaseRepository;

public interface CustomerRepository extends IBaseRepository<Customer, CustomerModelVo, CustomerDetails, CustomerQuery> {
}