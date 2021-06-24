package org.example.spring.repositories.auth.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.auth.mysql.converter.TUserTokenConverter;
import org.example.spring.repositories.auth.mysql.dao.TUserTokenDao;
import org.example.spring.repositories.auth.mysql.repository.TUserTokenRepository;
import org.example.spring.repositories.auth.mysql.table.dto.TUserTokenDto;
import org.example.spring.repositories.auth.mysql.table.po.TUserToken;
import org.example.spring.repositories.auth.mysql.table.query.TUserTokenQuery;
import org.example.spring.repositories.auth.mysql.table.vo.TUserTokenVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
@Deprecated
public class TUserTokenRepositoryImpl extends IBaseRepositoryImpl<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery, TUserTokenConverter, TUserTokenDao> implements TUserTokenRepository {
}