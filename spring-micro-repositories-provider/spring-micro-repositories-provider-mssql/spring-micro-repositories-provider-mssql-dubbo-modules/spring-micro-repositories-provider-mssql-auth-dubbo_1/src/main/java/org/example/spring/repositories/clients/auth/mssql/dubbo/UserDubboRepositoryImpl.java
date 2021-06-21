package org.example.spring.repositories.clients.auth.mssql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.clients.dubbo.auth.api.UserDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@DubboService
public class UserDubboRepositoryImpl extends CommonsDubboRepositoryImpl<User, UserVo, UserDTO, UserQuery, UserRepository> implements UserDubboRepository {
    private final UserRepository repository;

    protected UserDubboRepositoryImpl(UserRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public UserRoleDTO getWithRole(Long id) {
        return repository.getWithRole(id);
    }

    @Override
    public Optional<UserRoleDTO> getWithRoleOpt(Long id) {
        return repository.getWithRoleOpt(id);
    }

    @Override
    public UserRoleResourceDTO getWithRoleResource(Long id) {
        return repository.getWithRoleResource(id);
    }

    @Override
    public Optional<UserRoleResourceDTO> getWithRoleResourceOpt(Long id) {
        return repository.getWithRoleResourceOpt(id);
    }
}