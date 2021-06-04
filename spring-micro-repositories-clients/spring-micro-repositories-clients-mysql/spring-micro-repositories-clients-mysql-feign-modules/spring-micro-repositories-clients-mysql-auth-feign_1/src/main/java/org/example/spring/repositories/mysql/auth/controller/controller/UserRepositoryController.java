package org.example.spring.repositories.mysql.auth.controller.controller;

import org.example.spring.auth.api.UserRepositoryImpl;
import org.example.spring.auth.converter.UserRepositoryConverter;
import org.example.spring.repositories.feign.auth.clients.UserRepositoryClient;
import org.example.spring.repositories.mysql.auth.repository.TUserRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRepositoryController extends UserRepositoryImpl implements UserRepositoryClient {
    public UserRepositoryController(TUserRepository userRepository, UserRepositoryConverter userRepositoryConverter) {
        super(userRepository, userRepositoryConverter);
    }
}