package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.CustomerGroupQuery;
import org.example.modules.repository.mysql.entity.result.CustomerGroup;
import org.example.modules.repository.mysql.entity.vo.CustomerGroupVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface CustomerGroupRepository extends IBaseRepository<CustomerGroup, CustomerGroupVo, CustomerGroup, CustomerGroupQuery> {
}