package org.example.spring.repositories.customer.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.mssql.converter.TCustomerInfoConverter;
import org.example.spring.repositories.customer.mssql.dao.TCustomerInfoDao;
import org.example.spring.repositories.customer.mssql.repository.TCustomerInfoRepository;
import org.example.spring.repositories.customer.mssql.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.customer.mssql.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.mssql.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TCustomerInfoVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TCustomerInfoRepositoryImpl extends IBaseRepositoryImpl<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery, TCustomerInfoConverter, TCustomerInfoDao> implements TCustomerInfoRepository {
}