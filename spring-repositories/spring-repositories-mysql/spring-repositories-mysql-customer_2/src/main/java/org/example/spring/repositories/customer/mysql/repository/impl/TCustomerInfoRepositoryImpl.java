package org.example.spring.repositories.customer.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.mysql.converter.TCustomerInfoConverter;
import org.example.spring.repositories.customer.mysql.dao.TCustomerInfoDao;
import org.example.spring.repositories.customer.mysql.repository.TCustomerInfoRepository;
import org.example.spring.repositories.customer.mysql.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.customer.mysql.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.mysql.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.customer.mysql.table.vo.TCustomerInfoVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TCustomerInfoRepositoryImpl extends IBaseRepositoryImpl<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery, TCustomerInfoConverter, TCustomerInfoDao> implements TCustomerInfoRepository {
}