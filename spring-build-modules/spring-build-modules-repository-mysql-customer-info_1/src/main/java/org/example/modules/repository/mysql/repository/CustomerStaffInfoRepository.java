package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.CustomerGroupInfoQuery;
import org.example.modules.repository.mysql.entity.result.CustomerStaffInfoDetailsResult;
import org.example.modules.repository.mysql.entity.result.CustomerStaffInfoResult;
import org.example.modules.repository.mysql.entity.vo.CustomerStaffInfoFormVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface CustomerStaffInfoRepository extends IBaseRepository<CustomerStaffInfoResult, CustomerStaffInfoFormVo, CustomerStaffInfoDetailsResult, CustomerGroupInfoQuery> {
}