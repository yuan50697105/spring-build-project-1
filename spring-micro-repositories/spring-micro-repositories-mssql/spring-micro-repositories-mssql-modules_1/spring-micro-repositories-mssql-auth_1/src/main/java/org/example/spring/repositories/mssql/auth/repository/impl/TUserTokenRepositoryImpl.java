package org.example.spring.repositories.mssql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.repositories.mssql.auth.converter.TUserTokenConverter;
import org.example.spring.repositories.mssql.auth.dao.TUserTokenDao;
import org.example.spring.repositories.mssql.auth.repository.TUserTokenRepository;
import org.example.spring.repositories.mssql.auth.table.dto.TUserTokenDto;
import org.example.spring.repositories.mssql.auth.table.po.TUserToken;
import org.example.spring.repositories.mssql.auth.table.query.TUserTokenQuery;
import org.example.spring.repositories.mssql.auth.table.vo.TUserTokenVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TUserTokenRepositoryImpl extends IBaseRepositoryImpl<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery, TUserTokenConverter,TUserTokenDao > implements TUserTokenRepository {
}