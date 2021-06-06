package org.example.spring.repositories.clients.dubbo.mysql.auth;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.mysql.api.RoleRepositoryImpl;
import org.example.spring.repositories.clients.auth.mysql.converter.RoleRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.DubboRoleRepository;
import org.example.spring.repositories.mysql.auth.repository.TRoleRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboRoleRepositoryImpl extends RoleRepositoryImpl implements DubboRoleRepository {
    public DubboRoleRepositoryImpl(RoleRepositoryConverter converter, TRoleRepository repository) {
        super(converter, repository);
    }
}