package org.example.spring.repositories.customer.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.postgres.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.customer.postgres.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.postgres.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TCustomerInfoVo;

public interface TCustomerInfoRepository extends IBaseRepository<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery> {
}
