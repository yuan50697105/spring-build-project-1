package org.example.spring.repositories.customer.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.mysql.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.customer.mysql.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.mysql.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.customer.mysql.table.vo.TCustomerInfoVo;

public interface TCustomerInfoRepository extends IBaseRepository<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery> {
}
