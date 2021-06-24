package org.example.spring.repositories.auth.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.auth.oracle.converter.TUserTokenConverter;
import org.example.spring.repositories.auth.oracle.dao.TUserTokenDao;
import org.example.spring.repositories.auth.oracle.repository.TUserTokenRepository;
import org.example.spring.repositories.auth.oracle.table.dto.TUserTokenDto;
import org.example.spring.repositories.auth.oracle.table.po.TUserToken;
import org.example.spring.repositories.auth.oracle.table.query.TUserTokenQuery;
import org.example.spring.repositories.auth.oracle.table.vo.TUserTokenVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
@Deprecated
public class TUserTokenRepositoryImpl extends IBaseRepositoryImpl<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery, TUserTokenConverter, TUserTokenDao> implements TUserTokenRepository {
}