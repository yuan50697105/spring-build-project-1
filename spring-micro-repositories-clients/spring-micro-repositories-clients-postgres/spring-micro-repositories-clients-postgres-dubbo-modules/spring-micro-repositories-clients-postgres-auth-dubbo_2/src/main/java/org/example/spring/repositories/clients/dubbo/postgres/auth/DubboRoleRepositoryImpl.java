package org.example.spring.repositories.clients.dubbo.postgres.auth;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.postgres.api.RoleRepositoryImpl;
import org.example.spring.repositories.clients.auth.postgres.converter.RoleRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.DubboRoleRepository;
import org.example.spring.repositories.postgres.auth.repository.TRoleRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboRoleRepositoryImpl extends RoleRepositoryImpl implements DubboRoleRepository {
    public DubboRoleRepositoryImpl(RoleRepositoryConverter converter, TRoleRepository repository) {
        super(converter, repository);
    }
}