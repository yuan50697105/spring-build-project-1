package org.example.spring.repositories.customer.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.mysql.converter.TSellerInfoConverter;
import org.example.spring.repositories.customer.mysql.dao.TSellerInfoDao;
import org.example.spring.repositories.customer.mysql.repository.TSellerInfoRepository;
import org.example.spring.repositories.customer.mysql.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.customer.mysql.table.po.TSellerInfo;
import org.example.spring.repositories.customer.mysql.table.query.TSellerInfoQuery;
import org.example.spring.repositories.customer.mysql.table.vo.TSellerInfoVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TSellerInfoRepositoryImpl extends IBaseRepositoryImpl<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery, TSellerInfoConverter, TSellerInfoDao> implements TSellerInfoRepository {
}