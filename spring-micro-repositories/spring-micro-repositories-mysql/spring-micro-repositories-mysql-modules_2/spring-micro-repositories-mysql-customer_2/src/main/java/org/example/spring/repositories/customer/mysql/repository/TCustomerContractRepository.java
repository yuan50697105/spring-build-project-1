package org.example.spring.repositories.customer.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.mysql.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.customer.mysql.table.po.TCustomerContract;
import org.example.spring.repositories.customer.mysql.table.query.TCustomerContractQuery;
import org.example.spring.repositories.customer.mysql.table.vo.TCustomerContractVo;

public interface TCustomerContractRepository extends IBaseRepository<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery> {
}
