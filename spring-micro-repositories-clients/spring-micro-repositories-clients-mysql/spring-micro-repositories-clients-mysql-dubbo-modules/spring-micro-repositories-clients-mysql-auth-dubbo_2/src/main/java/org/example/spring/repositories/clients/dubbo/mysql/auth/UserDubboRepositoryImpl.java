package org.example.spring.repositories.clients.dubbo.mysql.auth;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.mysql.api.UserRepositoryImpl;
import org.example.spring.repositories.clients.auth.mysql.converter.UserRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.UserDubboRepository;
import org.example.spring.repositories.mysql.auth.repository.TUserRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class UserDubboRepositoryImpl extends UserRepositoryImpl implements UserDubboRepository {
    public UserDubboRepositoryImpl(TUserRepository userRepository, UserRepositoryConverter userRepositoryConverter) {
        super(userRepository, userRepositoryConverter);
    }
}