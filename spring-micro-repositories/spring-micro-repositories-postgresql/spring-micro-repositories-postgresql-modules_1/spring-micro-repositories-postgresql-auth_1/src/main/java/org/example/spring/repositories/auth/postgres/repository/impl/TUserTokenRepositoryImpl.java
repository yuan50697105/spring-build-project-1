package org.example.spring.repositories.auth.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.auth.postgres.converter.TUserTokenConverter;
import org.example.spring.repositories.auth.postgres.dao.TUserTokenDao;
import org.example.spring.repositories.auth.postgres.repository.TUserTokenRepository;
import org.example.spring.repositories.auth.postgres.table.dto.TUserTokenDto;
import org.example.spring.repositories.auth.postgres.table.po.TUserToken;
import org.example.spring.repositories.auth.postgres.table.query.TUserTokenQuery;
import org.example.spring.repositories.auth.postgres.table.vo.TUserTokenVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
@Deprecated
public class TUserTokenRepositoryImpl extends IBaseRepositoryImpl<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery, TUserTokenConverter, TUserTokenDao> implements TUserTokenRepository {
}