package org.example.spring.repositories.clients.feign.mysql.auth;

import org.example.spring.repositories.clients.auth.mysql.api.RoleRepositoryImpl;
import org.example.spring.repositories.clients.auth.mysql.converter.RoleRepositoryConverter;
import org.example.spring.repositories.feign.auth.clients.RoleRepositoryClient;
import org.example.spring.repositories.mysql.auth.repository.TRoleRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Primary
public class RoleRepositoryController extends RoleRepositoryImpl implements RoleRepositoryClient {
    public RoleRepositoryController(RoleRepositoryConverter converter, TRoleRepository repository) {
        super(converter, repository);
    }
}