package org.example.spring.repositories.aggregation.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.aggregation.auth.converter.TUserTokenConverter;
import org.example.spring.repositories.aggregation.auth.dao.TUserTokenDao;
import org.example.spring.repositories.aggregation.auth.repository.TUserTokenRepository;
import org.example.spring.repositories.aggregation.auth.table.dto.TUserTokenDto;
import org.example.spring.repositories.aggregation.auth.table.po.TUserToken;
import org.example.spring.repositories.aggregation.auth.table.query.TUserTokenQuery;
import org.example.spring.repositories.aggregation.auth.table.vo.TUserTokenVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
@Deprecated
public class TUserTokenRepositoryImpl extends IBaseRepositoryImpl<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery, TUserTokenConverter, TUserTokenDao> implements TUserTokenRepository {
}