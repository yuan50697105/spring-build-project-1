package org.example.spring.repositories.mssql.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mssql.customer.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.mssql.customer.table.po.TCustomerInfo;
import org.example.spring.repositories.mssql.customer.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.mssql.customer.table.vo.TCustomerInfoVo;

public interface TCustomerInfoRepository extends IBaseRepository<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery> {
}
