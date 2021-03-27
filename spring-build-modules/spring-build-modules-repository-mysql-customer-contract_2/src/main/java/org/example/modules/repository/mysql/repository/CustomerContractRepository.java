package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.vo.CustomerContractFormVo;
import org.example.modules.repository.mysql.entity.result.CustomerContractResult;
import org.example.modules.repository.mysql.entity.query.CustomerContractQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerContractVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

import java.util.List;

public interface CustomerContractRepository extends IBaseRepository<CustomerContractResult, CustomerContractFormVo, CustomerContractResult, CustomerContractQuery> {
    void save(CustomerContractVo contractVo);

    Long saveWithId(CustomerContractVo contract);

    List<CustomerContractResult> getListByCustomerId(Long id);
}
