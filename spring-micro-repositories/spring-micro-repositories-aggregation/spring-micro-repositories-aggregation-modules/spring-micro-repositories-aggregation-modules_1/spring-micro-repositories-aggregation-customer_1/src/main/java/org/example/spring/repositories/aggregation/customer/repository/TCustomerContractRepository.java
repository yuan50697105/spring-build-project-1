package org.example.spring.repositories.aggregation.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.aggregation.customer.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.aggregation.customer.table.po.TCustomerContract;
import org.example.spring.repositories.aggregation.customer.table.query.TCustomerContractQuery;
import org.example.spring.repositories.aggregation.customer.table.vo.TCustomerContractVo;

public interface TCustomerContractRepository extends IBaseRepository<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery> {
}
