package org.example.spring.daos.oracle.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.oracle.auth.converter.TUserTokenConverter;
import org.example.spring.daos.oracle.auth.dao.TUserTokenDao;
import org.example.spring.daos.oracle.auth.repository.TUserTokenRepository;
import org.example.spring.daos.oracle.auth.table.dto.TUserTokenDto;
import org.example.spring.daos.oracle.auth.table.po.TUserToken;
import org.example.spring.daos.oracle.auth.table.query.TUserTokenQuery;
import org.example.spring.daos.oracle.auth.table.vo.TUserTokenVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TUserTokenRepositoryImpl extends IBaseRepositoryImpl<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery, TUserTokenConverter,TUserTokenDao > implements TUserTokenRepository {
}