package org.example.spring.repositories.mysql.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.customer.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.repositories.mysql.customer.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TCustomerInfoVo;

public interface TCustomerInfoRepository extends IBaseRepository<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery> {
}
