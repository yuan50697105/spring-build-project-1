package org.example.spring.repositories.customer.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.postgres.converter.TCustomerInfoConverter;
import org.example.spring.repositories.customer.postgres.dao.TCustomerInfoDao;
import org.example.spring.repositories.customer.postgres.repository.TCustomerInfoRepository;
import org.example.spring.repositories.customer.postgres.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.customer.postgres.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.postgres.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TCustomerInfoVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TCustomerInfoRepositoryImpl extends IBaseRepositoryImpl<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery, TCustomerInfoConverter, TCustomerInfoDao> implements TCustomerInfoRepository {
}