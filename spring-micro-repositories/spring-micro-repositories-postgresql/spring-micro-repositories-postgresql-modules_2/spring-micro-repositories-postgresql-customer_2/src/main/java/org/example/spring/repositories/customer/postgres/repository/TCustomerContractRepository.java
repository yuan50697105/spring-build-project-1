package org.example.spring.repositories.customer.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.postgres.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.customer.postgres.table.po.TCustomerContract;
import org.example.spring.repositories.customer.postgres.table.query.TCustomerContractQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TCustomerContractVo;

public interface TCustomerContractRepository extends IBaseRepository<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery> {
}
