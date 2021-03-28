package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.po.TCustomerStaffInfo;
import org.example.modules.repository.mysql.entity.query.CustomerGroupInfoQuery;
import org.example.modules.repository.mysql.entity.result.CustomerGroupInfoDetailsResult;
import org.example.modules.repository.mysql.entity.result.CustomerGroupInfoResult;
import org.example.modules.repository.mysql.entity.vo.CustomerGroupInfoFormVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface CustomerGroupInfoRepository extends IBaseRepository<CustomerGroupInfoResult, CustomerGroupInfoFormVo, CustomerGroupInfoDetailsResult, CustomerGroupInfoQuery> {
}