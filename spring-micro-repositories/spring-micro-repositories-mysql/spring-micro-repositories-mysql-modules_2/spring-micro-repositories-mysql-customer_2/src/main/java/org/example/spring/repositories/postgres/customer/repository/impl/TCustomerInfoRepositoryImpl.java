package org.example.spring.repositories.postgres.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.postgres.customer.converter.TCustomerInfoConverter;
import org.example.spring.repositories.postgres.customer.dao.TCustomerInfoDao;
import org.example.spring.repositories.postgres.customer.dao.impl.TCustomerInfoDaoImpl;
import org.example.spring.repositories.postgres.customer.repository.TCustomerInfoRepository;
import org.example.spring.repositories.postgres.customer.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.postgres.customer.table.po.TCustomerInfo;
import org.example.spring.repositories.postgres.customer.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.postgres.customer.table.vo.TCustomerInfoVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TCustomerInfoRepositoryImpl extends IBaseRepositoryImpl<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery, TCustomerInfoConverter, TCustomerInfoDao> implements TCustomerInfoRepository {
}