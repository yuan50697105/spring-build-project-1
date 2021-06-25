package org.example.spring.repositories.auth.oracle.repository.impl;

import org.example.spring.plugins.mybatis.repository.impl.ICommonsRepositoryImpl;
import org.example.spring.repositories.auth.oracle.converter.UserTokenConverter;
import org.example.spring.repositories.auth.oracle.dao.TUserTokenDao;
import org.example.spring.repositories.auth.oracle.repository.UserTokenRepository;
import org.example.spring.repositories.auth.oracle.table.po.TUserToken;
import org.example.spring.repositories.auth.oracle.table.query.TUserTokenQuery;
import org.example.spring.repositories.commons.entity.auth.dto.UserTokenDto;
import org.example.spring.repositories.commons.entity.auth.po.UserToken;
import org.example.spring.repositories.commons.entity.auth.query.UserTokenQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserTokenVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserTokenRepositoryImpl extends ICommonsRepositoryImpl<UserToken, TUserToken, UserTokenQuery, TUserTokenQuery, UserTokenVo, UserTokenDto, UserTokenConverter, TUserTokenDao> implements UserTokenRepository {
    protected UserTokenRepositoryImpl(UserTokenConverter converter, TUserTokenDao dao) {
        super(converter, dao);
    }
}