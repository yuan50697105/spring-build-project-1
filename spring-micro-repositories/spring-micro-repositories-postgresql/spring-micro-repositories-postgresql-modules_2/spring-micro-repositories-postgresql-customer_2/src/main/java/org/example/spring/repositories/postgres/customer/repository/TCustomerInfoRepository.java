package org.example.spring.repositories.postgres.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.postgres.customer.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.postgres.customer.table.po.TCustomerInfo;
import org.example.spring.repositories.postgres.customer.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.postgres.customer.table.vo.TCustomerInfoVo;

public interface TCustomerInfoRepository extends IBaseRepository<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery> {
}