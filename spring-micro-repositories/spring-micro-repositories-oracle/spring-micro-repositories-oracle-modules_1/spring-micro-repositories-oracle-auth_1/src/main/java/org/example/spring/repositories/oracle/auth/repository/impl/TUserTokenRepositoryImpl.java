package org.example.spring.repositories.oracle.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.oracle.auth.converter.TUserTokenConverter;
import org.example.spring.repositories.oracle.auth.dao.TUserTokenDao;
import org.example.spring.repositories.oracle.auth.repository.TUserTokenRepository;
import org.example.spring.repositories.oracle.auth.table.dto.TUserTokenDto;
import org.example.spring.repositories.oracle.auth.table.po.TUserToken;
import org.example.spring.repositories.oracle.auth.table.query.TUserTokenQuery;
import org.example.spring.repositories.oracle.auth.table.vo.TUserTokenVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TUserTokenRepositoryImpl extends IBaseRepositoryImpl<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery, TUserTokenConverter, TUserTokenDao> implements TUserTokenRepository {
}