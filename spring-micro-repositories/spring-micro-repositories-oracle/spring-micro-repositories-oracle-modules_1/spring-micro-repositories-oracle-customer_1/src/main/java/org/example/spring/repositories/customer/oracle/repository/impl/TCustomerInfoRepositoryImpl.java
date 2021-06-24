package org.example.spring.repositories.customer.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.oracle.converter.TCustomerInfoConverter;
import org.example.spring.repositories.customer.oracle.dao.TCustomerInfoDao;
import org.example.spring.repositories.customer.oracle.repository.TCustomerInfoRepository;
import org.example.spring.repositories.customer.oracle.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.customer.oracle.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.oracle.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.customer.oracle.table.vo.TCustomerInfoVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TCustomerInfoRepositoryImpl extends IBaseRepositoryImpl<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery, TCustomerInfoConverter, TCustomerInfoDao> implements TCustomerInfoRepository {
}