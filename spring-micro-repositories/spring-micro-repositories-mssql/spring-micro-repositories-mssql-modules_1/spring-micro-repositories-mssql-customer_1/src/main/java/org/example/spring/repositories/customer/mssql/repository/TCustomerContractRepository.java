package org.example.spring.repositories.customer.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.mssql.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.customer.mssql.table.po.TCustomerContract;
import org.example.spring.repositories.customer.mssql.table.query.TCustomerContractQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TCustomerContractVo;

public interface TCustomerContractRepository extends IBaseRepository<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery> {
}
