package org.example.spring.repositories.clients.feign.mysql.auth;


import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.feign.auth.clients.UserRepositoryClient;
import org.example.spring.repositories.feign.auth.clients.impl.UserRepositoryClientImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Primary
public class UserRepositoryController extends UserRepositoryClientImpl implements UserRepositoryClient {
    public UserRepositoryController(UserRepository repository) {
        super(repository);
    }
}