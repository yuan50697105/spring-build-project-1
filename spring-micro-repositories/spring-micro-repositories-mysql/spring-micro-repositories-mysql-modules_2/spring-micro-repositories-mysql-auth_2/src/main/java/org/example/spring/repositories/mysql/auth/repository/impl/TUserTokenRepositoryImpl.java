package org.example.spring.repositories.mysql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.auth.converter.TUserTokenConverter;
import org.example.spring.repositories.mysql.auth.dao.TUserTokenDao;
import org.example.spring.repositories.mysql.auth.repository.TUserTokenRepository;
import org.example.spring.repositories.mysql.auth.table.dto.TUserTokenDto;
import org.example.spring.repositories.mysql.auth.table.po.TUserToken;
import org.example.spring.repositories.mysql.auth.table.query.TUserTokenQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TUserTokenVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TUserTokenRepositoryImpl extends IBaseRepositoryImpl<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery, TUserTokenConverter, TUserTokenDao> implements TUserTokenRepository {
}