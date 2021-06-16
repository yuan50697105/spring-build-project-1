package org.example.spring.repositories.clients.auth.postgres.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.postgres.api.RoleRepositoryImpl;
import org.example.spring.repositories.clients.auth.postgres.converter.RoleRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.RoleDubboRepository;
import org.example.spring.repositories.postgres.auth.repository.TRoleRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class RoleDubboRepositoryImpl extends RoleRepositoryImpl implements RoleDubboRepository {
    public RoleDubboRepositoryImpl(RoleRepositoryConverter converter, TRoleRepository repository) {
        super(converter, repository);
    }
}