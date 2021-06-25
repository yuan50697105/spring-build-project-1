package org.example.spring.repositories.customer.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.oracle.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.customer.oracle.table.po.TCustomerContract;
import org.example.spring.repositories.customer.oracle.table.query.TCustomerContractQuery;
import org.example.spring.repositories.customer.oracle.table.vo.TCustomerContractVo;

public interface TCustomerContractRepository extends IBaseRepository<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery> {
}
