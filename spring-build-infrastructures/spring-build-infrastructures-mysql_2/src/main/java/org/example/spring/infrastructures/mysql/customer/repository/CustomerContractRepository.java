package org.example.spring.infrastructures.mysql.customer.repository;

import org.example.spring.infrastructures.mysql.customer.entity.query.CustomerContractQuery;
import org.example.spring.infrastructures.mysql.customer.entity.query.CustomerQuery;
import org.example.spring.infrastructures.mysql.customer.entity.result.Customer;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerContract;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerContractDetails;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerDetails;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerContractFormVo;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface CustomerContractRepository extends IBaseRepository<CustomerContract, CustomerContractFormVo, CustomerContractDetails, CustomerContractQuery> {
    void updateFile(Long id, String fileName);
}
