package org.example.spring.repositories.clients.feign.mysql.auth;

import org.example.spring.repositories.clients.auth.mysql.api.UserRepositoryImpl;
import org.example.spring.repositories.clients.auth.mysql.converter.UserRepositoryConverter;
import org.example.spring.repositories.feign.auth.clients.UserRepositoryClient;
import org.example.spring.repositories.mysql.auth.repository.TUserRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Primary
public class UserRepositoryController extends UserRepositoryImpl implements UserRepositoryClient {
    public UserRepositoryController(TUserRepository userRepository, UserRepositoryConverter userRepositoryConverter) {
        super(userRepository, userRepositoryConverter);
    }
}