package org.example.domains.service;

import org.example.modules.repository.mysql.entity.query.CustomerContractQuery;
import org.example.modules.repository.mysql.entity.result.CustomerContract;
import org.example.modules.repository.mysql.entity.vo.CustomerContractFormVo;
import org.example.plugins.mybatis.entity.IPageData;

import java.util.List;

public interface CustomerContractService {
    void save(CustomerContractFormVo formVo);

    void update(CustomerContractFormVo formVo);

    void delete(List<Long> ids);

    CustomerContract get(Long id);

    CustomerContract one(CustomerContractQuery query);

    List<CustomerContract> list(CustomerContractQuery query);

    IPageData<CustomerContract> page(CustomerContractQuery query);
}
