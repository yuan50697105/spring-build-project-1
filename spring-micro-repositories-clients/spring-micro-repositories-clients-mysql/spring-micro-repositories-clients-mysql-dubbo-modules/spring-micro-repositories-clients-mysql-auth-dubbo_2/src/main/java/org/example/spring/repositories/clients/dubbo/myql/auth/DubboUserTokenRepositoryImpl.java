package org.example.spring.repositories.clients.dubbo.myql.auth;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.auth.api.UserTokenRepositoryImpl;
import org.example.spring.auth.converter.UserTokenRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.DubboUserTokenRepository;
import org.example.spring.repositories.mysql.auth.repository.TUserTokenRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboUserTokenRepositoryImpl extends UserTokenRepositoryImpl implements DubboUserTokenRepository {
    public DubboUserTokenRepositoryImpl(UserTokenRepositoryConverter converter, TUserTokenRepository repository) {
        super(converter, repository);
    }
}