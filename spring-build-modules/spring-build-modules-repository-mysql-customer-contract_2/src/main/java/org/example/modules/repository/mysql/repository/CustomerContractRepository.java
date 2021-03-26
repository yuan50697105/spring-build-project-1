package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.vo.CustomerContractVo;
import org.example.modules.repository.mysql.entity.query.CustomerContractQuery;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface CustomerContractRepository extends IBaseRepository<CustomerContractVo, CustomerContractVo, CustomerContractVo, CustomerContractQuery> {
}
