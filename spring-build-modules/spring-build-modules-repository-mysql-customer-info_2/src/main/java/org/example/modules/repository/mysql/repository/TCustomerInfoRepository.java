package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.CustomerInfoQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface TCustomerInfoRepository extends IBaseRepository<CustomerInfoVo, CustomerInfoVo, CustomerInfoQuery> {
}
