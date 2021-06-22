package org.example.spring.repositories.aggregation.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.aggregation.customer.converter.TSellerInfoConverter;
import org.example.spring.repositories.aggregation.customer.dao.TSellerInfoDao;
import org.example.spring.repositories.aggregation.customer.repository.TSellerInfoRepository;
import org.example.spring.repositories.aggregation.customer.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.aggregation.customer.table.po.TSellerInfo;
import org.example.spring.repositories.aggregation.customer.table.query.TSellerInfoQuery;
import org.example.spring.repositories.aggregation.customer.table.vo.TSellerInfoVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TSellerInfoRepositoryImpl extends IBaseRepositoryImpl<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery, TSellerInfoConverter, TSellerInfoDao> implements TSellerInfoRepository {
}