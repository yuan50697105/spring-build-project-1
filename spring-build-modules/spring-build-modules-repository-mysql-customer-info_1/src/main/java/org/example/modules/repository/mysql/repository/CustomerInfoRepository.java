package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.CustomerInfoQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoFormVo;
import org.example.modules.repository.mysql.entity.result.CustomerInfo;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface CustomerInfoRepository extends IBaseRepository<CustomerInfo, CustomerInfoFormVo, CustomerInfo, CustomerInfoQuery> {
    Long saveWithId(CustomerInfoVo customer);

    void save(CustomerInfoVo customer);
}
