package org.example.spring.repositories.mysql.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.customer.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerContract;
import org.example.spring.repositories.mysql.customer.table.query.TCustomerContractQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TCustomerContractVo;

public interface TCustomerContractRepository extends IBaseRepository<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery> {
}
