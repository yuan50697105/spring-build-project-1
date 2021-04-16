package org.example.spring.models.customer.repository;

import org.example.spring.models.customer.entity.query.CustomerContractQuery;
import org.example.spring.models.customer.entity.result.CustomerContract;
import org.example.spring.models.customer.entity.result.CustomerContractDetails;
import org.example.spring.models.customer.entity.vo.CustomerContractFormVo;
import org.example.spring.plugins.commons.repository.IBaseRepository;

public interface CustomerContractRepository extends IBaseRepository<CustomerContract, CustomerContractFormVo, CustomerContractDetails, CustomerContractQuery> {
    void updateFile(Long id, String fileName);
}
