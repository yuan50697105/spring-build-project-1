package org.example.spring.repositories.clients.dubbo.mysql.auth;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.mysql.api.UserTokenRepositoryImpl;
import org.example.spring.repositories.clients.auth.mysql.converter.UserTokenRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.UserTokenDubboRepository;
import org.example.spring.repositories.mysql.auth.repository.TUserTokenRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class UserTokenDubboRepositoryImpl extends UserTokenRepositoryImpl implements UserTokenDubboRepository {
    public UserTokenDubboRepositoryImpl(UserTokenRepositoryConverter converter, TUserTokenRepository repository) {
        super(converter, repository);
    }
}