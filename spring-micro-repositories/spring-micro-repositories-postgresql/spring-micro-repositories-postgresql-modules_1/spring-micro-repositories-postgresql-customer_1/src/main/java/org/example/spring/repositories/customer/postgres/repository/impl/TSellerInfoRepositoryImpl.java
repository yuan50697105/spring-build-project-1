package org.example.spring.repositories.customer.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.postgres.converter.TSellerInfoConverter;
import org.example.spring.repositories.customer.postgres.dao.TSellerInfoDao;
import org.example.spring.repositories.customer.postgres.repository.TSellerInfoRepository;
import org.example.spring.repositories.customer.postgres.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.customer.postgres.table.po.TSellerInfo;
import org.example.spring.repositories.customer.postgres.table.query.TSellerInfoQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TSellerInfoVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TSellerInfoRepositoryImpl extends IBaseRepositoryImpl<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery, TSellerInfoConverter, TSellerInfoDao> implements TSellerInfoRepository {
}