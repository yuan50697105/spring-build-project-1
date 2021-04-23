package org.example.spring.models.clickhouse.customer.repository;

import org.example.spring.models.clickhouse.customer.entity.query.CustomerContractQuery;
import org.example.spring.models.clickhouse.customer.entity.result.CustomerContract;
import org.example.spring.models.clickhouse.customer.entity.result.CustomerContractDetails;
import org.example.spring.models.clickhouse.customer.entity.vo.CustomerContractModelVo;
import org.example.spring.models.commons.repository.IBaseRepository;

public interface CustomerContractRepository extends IBaseRepository<CustomerContract, CustomerContractModelVo, CustomerContractDetails, CustomerContractQuery> {
    void updateFile(Long id, String fileName);
}
