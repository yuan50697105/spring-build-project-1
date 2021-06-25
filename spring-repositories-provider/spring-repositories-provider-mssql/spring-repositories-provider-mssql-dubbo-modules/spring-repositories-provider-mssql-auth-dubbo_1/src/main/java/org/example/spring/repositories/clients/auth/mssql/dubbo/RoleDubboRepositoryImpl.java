package org.example.spring.repositories.clients.auth.mssql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.api.RoleRepository;
import org.example.spring.repositories.clients.dubbo.auth.api.RoleDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.RoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Role;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@DubboService
public class RoleDubboRepositoryImpl extends CommonsDubboRepositoryImpl<Role, RoleVo, RoleDTO, RoleQuery, RoleRepository> implements RoleDubboRepository {
    private final RoleRepository repository;

    protected RoleDubboRepositoryImpl(RoleRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public RoleResourceDTO getRoleResource(Long id) {
        return repository.getRoleResource(id);
    }

    @Override
    public Optional<RoleResourceDTO> getRoleResourceOpt(Long id) {
        return repository.getRoleResourceOpt(id);
    }
}