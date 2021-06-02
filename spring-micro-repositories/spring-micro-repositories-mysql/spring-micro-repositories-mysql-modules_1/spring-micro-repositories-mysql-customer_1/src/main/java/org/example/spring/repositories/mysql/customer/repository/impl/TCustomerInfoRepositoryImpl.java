package org.example.spring.repositories.mysql.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.customer.converter.TCustomerInfoConverter;
import org.example.spring.repositories.mysql.customer.dao.TCustomerInfoDao;
import org.example.spring.repositories.mysql.customer.repository.TCustomerInfoRepository;
import org.example.spring.repositories.mysql.customer.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.repositories.mysql.customer.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TCustomerInfoVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TCustomerInfoRepositoryImpl extends IBaseRepositoryImpl<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery, TCustomerInfoConverter, TCustomerInfoDao> implements TCustomerInfoRepository {
}