package org.example.spring.repositories.clients.auth.postgres.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.postgres.api.UserTokenRepositoryImpl;
import org.example.spring.repositories.clients.auth.postgres.converter.UserTokenRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.DubboUserTokenRepository;
import org.example.spring.repositories.postgres.auth.repository.TUserTokenRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboUserTokenRepositoryImpl extends UserTokenRepositoryImpl implements DubboUserTokenRepository {
    public DubboUserTokenRepositoryImpl(UserTokenRepositoryConverter converter, TUserTokenRepository repository) {
        super(converter, repository);
    }
}