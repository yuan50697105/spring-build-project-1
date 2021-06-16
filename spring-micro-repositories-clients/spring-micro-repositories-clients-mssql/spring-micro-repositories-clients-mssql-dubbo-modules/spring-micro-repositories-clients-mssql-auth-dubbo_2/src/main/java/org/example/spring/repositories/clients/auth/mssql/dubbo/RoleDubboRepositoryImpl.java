package org.example.spring.repositories.clients.auth.mssql.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.api.RoleRepository;
import org.example.spring.repositories.clients.auth.mssql.api.RoleRepositoryImpl;
import org.example.spring.repositories.clients.auth.mssql.converter.RoleRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.auth.api.RoleDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.po.Role;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;
import org.example.spring.repositories.mssql.auth.repository.TRoleRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class RoleDubboRepositoryImpl extends CommonsDubboRepositoryImpl<Role, RoleVo, RoleDTO, RoleQuery, RoleRepository> implements RoleDubboRepository {
    protected RoleDubboRepositoryImpl(RoleRepository repository) {
        super(repository);
    }
}