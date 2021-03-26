package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.CustomerInfoQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoFormVo;
import org.example.modules.repository.mysql.entity.result.CustomerInfoResult;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface CustomerInfoRepository extends IBaseRepository<CustomerInfoResult, CustomerInfoFormVo, CustomerInfoResult, CustomerInfoQuery> {
    Long saveWithId(CustomerInfoVo customer);
}
