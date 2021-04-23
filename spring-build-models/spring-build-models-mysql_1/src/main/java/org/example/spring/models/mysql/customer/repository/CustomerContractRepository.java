package org.example.spring.models.mysql.customer.repository;

import org.example.spring.models.mysql.customer.entity.query.CustomerContractQuery;
import org.example.spring.models.mysql.customer.entity.result.CustomerContract;
import org.example.spring.models.mysql.customer.entity.result.CustomerContractDetails;
import org.example.spring.models.mysql.customer.entity.vo.CustomerContractModelVo;
import org.example.spring.models.commons.repository.IBaseRepository;

public interface CustomerContractRepository extends IBaseRepository<CustomerContract, CustomerContractModelVo, CustomerContractDetails, CustomerContractQuery> {
    void updateFile(Long id, String fileName);
}
