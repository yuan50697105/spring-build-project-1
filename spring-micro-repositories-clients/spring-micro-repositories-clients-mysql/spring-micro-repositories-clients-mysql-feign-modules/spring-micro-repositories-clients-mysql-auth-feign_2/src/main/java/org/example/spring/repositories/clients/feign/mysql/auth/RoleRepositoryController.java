package org.example.spring.repositories.clients.feign.mysql.auth;


import org.example.spring.repositories.clients.auth.api.RoleRepository;
import org.example.spring.repositories.feign.auth.clients.RoleRepositoryClient;
import org.example.spring.repositories.feign.auth.clients.impl.RoleRepositoryClientImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Primary
public class RoleRepositoryController extends RoleRepositoryClientImpl implements RoleRepositoryClient {
    public RoleRepositoryController(RoleRepository repository) {
        super(repository);
    }
}