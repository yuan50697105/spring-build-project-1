package org.example.spring.repositories.mssql.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mssql.customer.converter.TSellerInfoConverter;
import org.example.spring.repositories.mssql.customer.dao.TSellerInfoDao;
import org.example.spring.repositories.mssql.customer.repository.TSellerInfoRepository;
import org.example.spring.repositories.mssql.customer.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.mssql.customer.table.po.TSellerInfo;
import org.example.spring.repositories.mssql.customer.table.query.TSellerInfoQuery;
import org.example.spring.repositories.mssql.customer.table.vo.TSellerInfoVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TSellerInfoRepositoryImpl extends IBaseRepositoryImpl<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery, TSellerInfoConverter, TSellerInfoDao> implements TSellerInfoRepository {
}