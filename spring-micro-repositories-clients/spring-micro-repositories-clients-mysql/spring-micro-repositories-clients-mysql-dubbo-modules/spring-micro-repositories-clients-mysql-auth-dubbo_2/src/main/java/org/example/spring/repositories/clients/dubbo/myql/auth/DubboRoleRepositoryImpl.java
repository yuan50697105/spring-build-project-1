package org.example.spring.repositories.clients.dubbo.myql.auth;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.auth.api.RoleRepositoryImpl;
import org.example.spring.auth.converter.RoleRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.DubboRoleRepository;
import org.example.spring.repositories.mysql.auth.repository.TRoleRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@DubboService
public class DubboRoleRepositoryImpl extends RoleRepositoryImpl implements DubboRoleRepository {
    public DubboRoleRepositoryImpl(RoleRepositoryConverter converter, TRoleRepository repository) {
        super(converter, repository);
    }
}