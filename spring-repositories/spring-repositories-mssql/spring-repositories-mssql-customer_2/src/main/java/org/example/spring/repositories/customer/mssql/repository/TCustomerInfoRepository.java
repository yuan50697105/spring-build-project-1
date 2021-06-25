package org.example.spring.repositories.customer.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.mssql.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.customer.mssql.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.mssql.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TCustomerInfoVo;

public interface TCustomerInfoRepository extends IBaseRepository<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery> {
}
