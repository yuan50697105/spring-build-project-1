package org.example.spring.repositories.clients.auth.oracle.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.oracle.api.RoleRepositoryImpl;
import org.example.spring.repositories.clients.auth.oracle.converter.RoleRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.RoleDubboRepository;
import org.example.spring.repositories.oracle.auth.repository.TRoleRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class RoleDubboRepositoryImpl extends RoleRepositoryImpl implements RoleDubboRepository {
    public RoleDubboRepositoryImpl(RoleRepositoryConverter converter, TRoleRepository repository) {
        super(converter, repository);
    }
}