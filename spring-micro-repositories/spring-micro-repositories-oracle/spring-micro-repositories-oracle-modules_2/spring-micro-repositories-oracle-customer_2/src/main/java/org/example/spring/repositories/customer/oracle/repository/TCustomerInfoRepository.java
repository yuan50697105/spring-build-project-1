package org.example.spring.repositories.customer.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.oracle.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.customer.oracle.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.oracle.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.customer.oracle.table.vo.TCustomerInfoVo;

public interface TCustomerInfoRepository extends IBaseRepository<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery> {
}
