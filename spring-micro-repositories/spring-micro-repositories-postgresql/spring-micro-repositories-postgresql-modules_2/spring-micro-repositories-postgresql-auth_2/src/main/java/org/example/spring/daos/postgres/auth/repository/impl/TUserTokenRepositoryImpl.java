package org.example.spring.daos.postgres.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.postgres.auth.converter.TUserTokenConverter;
import org.example.spring.daos.postgres.auth.dao.TUserTokenDao;
import org.example.spring.daos.postgres.auth.repository.TUserTokenRepository;
import org.example.spring.daos.postgres.auth.table.dto.TUserTokenDto;
import org.example.spring.daos.postgres.auth.table.po.TUserToken;
import org.example.spring.daos.postgres.auth.table.query.TUserTokenQuery;
import org.example.spring.daos.postgres.auth.table.vo.TUserTokenVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TUserTokenRepositoryImpl extends IBaseRepositoryImpl<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery, TUserTokenConverter,TUserTokenDao > implements TUserTokenRepository {
}