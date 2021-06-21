package org.example.spring.repositories.clients.auth.oracle.feign;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.feign.auth.clients.UserRepositoryClient;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@DubboService
public class UserRepositoryController extends CommonsFeignClientImpl<User, UserVo, UserDTO, UserQuery, UserRepository> implements UserRepositoryClient {
    private final UserRepository repository;

    public UserRepositoryController(UserRepository repository) {
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
        return Optional.empty();
    }
}