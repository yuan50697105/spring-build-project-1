package org.example.spring.models.postgresql.customer.repository;

import org.example.spring.models.commons.repository.IBaseRepository;
import org.example.spring.models.postgresql.customer.entity.query.CustomerContractQuery;
import org.example.spring.models.postgresql.customer.entity.result.CustomerContract;
import org.example.spring.models.postgresql.customer.entity.result.CustomerContractDetails;
import org.example.spring.models.postgresql.customer.entity.vo.CustomerContractModelVo;

public interface CustomerContractRepository extends IBaseRepository<CustomerContract, CustomerContractModelVo, CustomerContractDetails, CustomerContractQuery> {
    void updateFile(Long id, String fileName);
}
