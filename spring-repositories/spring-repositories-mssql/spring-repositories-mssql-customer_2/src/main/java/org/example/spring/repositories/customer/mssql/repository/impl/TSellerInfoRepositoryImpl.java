package org.example.spring.repositories.customer.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.mssql.converter.TSellerInfoConverter;
import org.example.spring.repositories.customer.mssql.dao.TSellerInfoDao;
import org.example.spring.repositories.customer.mssql.repository.TSellerInfoRepository;
import org.example.spring.repositories.customer.mssql.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.customer.mssql.table.po.TSellerInfo;
import org.example.spring.repositories.customer.mssql.table.query.TSellerInfoQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TSellerInfoVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TSellerInfoRepositoryImpl extends IBaseRepositoryImpl<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery, TSellerInfoConverter, TSellerInfoDao> implements TSellerInfoRepository {
}