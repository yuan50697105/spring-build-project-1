package org.example.spring.repositories.clients.auth.mssql.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.api.UserTokenRepository;
import org.example.spring.repositories.clients.auth.mssql.api.UserTokenRepositoryImpl;
import org.example.spring.repositories.clients.auth.mssql.converter.UserTokenRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.UserTokenDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.UserTokenDto;
import org.example.spring.repositories.commons.entity.auth.po.UserToken;
import org.example.spring.repositories.commons.entity.auth.query.UserTokenQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserTokenVo;
import org.example.spring.repositories.mssql.auth.repository.TUserTokenRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class UserTokenDubboRepositoryImpl extends CommonsDubboRepositoryImpl<UserToken, UserTokenVo, UserTokenDto, UserTokenQuery, UserTokenRepository> implements UserTokenDubboRepository {
    protected UserTokenDubboRepositoryImpl(UserTokenRepository repository) {
        super(repository);
    }
}