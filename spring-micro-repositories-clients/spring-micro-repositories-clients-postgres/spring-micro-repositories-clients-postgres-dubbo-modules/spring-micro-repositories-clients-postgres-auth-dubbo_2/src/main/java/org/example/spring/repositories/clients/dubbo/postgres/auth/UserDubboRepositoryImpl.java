package org.example.spring.repositories.clients.dubbo.postgres.auth;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.postgres.api.UserRepositoryImpl;
import org.example.spring.repositories.clients.auth.postgres.converter.UserRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.UserDubboRepository;
import org.example.spring.repositories.postgres.auth.repository.TUserRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class UserDubboRepositoryImpl extends UserRepositoryImpl implements UserDubboRepository {
    public UserDubboRepositoryImpl(TUserRepository userRepository, UserRepositoryConverter userRepositoryConverter) {
        super(userRepository, userRepositoryConverter);
    }
}