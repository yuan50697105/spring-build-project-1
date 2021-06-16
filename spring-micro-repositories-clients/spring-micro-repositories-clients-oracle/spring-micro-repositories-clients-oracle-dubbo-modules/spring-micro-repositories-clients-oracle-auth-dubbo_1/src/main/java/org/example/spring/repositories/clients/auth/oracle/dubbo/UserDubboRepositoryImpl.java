package org.example.spring.repositories.clients.auth.oracle.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.oracle.api.UserRepositoryImpl;
import org.example.spring.repositories.clients.auth.oracle.converter.UserRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.UserDubboRepository;
import org.example.spring.repositories.oracle.auth.repository.TUserRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class UserDubboRepositoryImpl extends UserRepositoryImpl implements UserDubboRepository {
    public UserDubboRepositoryImpl(TUserRepository userRepository, UserRepositoryConverter userRepositoryConverter) {
        super(userRepository, userRepositoryConverter);
    }
}