package org.example.spring.repositories.clients.auth.mysql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.mysql.api.UserRepositoryImpl;
import org.example.spring.repositories.clients.auth.mysql.converter.UserRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.DubboUserRepository;
import org.example.spring.repositories.mysql.auth.repository.TUserRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboUserRepositoryImpl extends UserRepositoryImpl implements DubboUserRepository {
    public DubboUserRepositoryImpl(TUserRepository userRepository, UserRepositoryConverter userRepositoryConverter) {
        super(userRepository, userRepositoryConverter);
    }
}