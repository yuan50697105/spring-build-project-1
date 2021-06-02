package org.example.spring.repositories.oracle.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.customer.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.oracle.customer.table.po.TCustomerInfo;
import org.example.spring.repositories.oracle.customer.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.oracle.customer.table.vo.TCustomerInfoVo;

public interface TCustomerInfoRepository extends IBaseRepository<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery> {
}