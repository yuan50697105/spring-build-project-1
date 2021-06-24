package org.example.spring.repositories.auth.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.auth.mssql.converter.TUserTokenConverter;
import org.example.spring.repositories.auth.mssql.dao.TUserTokenDao;
import org.example.spring.repositories.auth.mssql.repository.TUserTokenRepository;
import org.example.spring.repositories.auth.mssql.table.dto.TUserTokenDto;
import org.example.spring.repositories.auth.mssql.table.po.TUserToken;
import org.example.spring.repositories.auth.mssql.table.query.TUserTokenQuery;
import org.example.spring.repositories.auth.mssql.table.vo.TUserTokenVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
@Deprecated
public class TUserTokenRepositoryImpl extends IBaseRepositoryImpl<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery, TUserTokenConverter, TUserTokenDao> implements TUserTokenRepository {
}