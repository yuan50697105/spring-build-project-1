package org.example.spring.repositories.customer.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.oracle.converter.TSellerInfoConverter;
import org.example.spring.repositories.customer.oracle.dao.TSellerInfoDao;
import org.example.spring.repositories.customer.oracle.repository.TSellerInfoRepository;
import org.example.spring.repositories.customer.oracle.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.customer.oracle.table.po.TSellerInfo;
import org.example.spring.repositories.customer.oracle.table.query.TSellerInfoQuery;
import org.example.spring.repositories.customer.oracle.table.vo.TSellerInfoVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TSellerInfoRepositoryImpl extends IBaseRepositoryImpl<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery, TSellerInfoConverter, TSellerInfoDao> implements TSellerInfoRepository {
}