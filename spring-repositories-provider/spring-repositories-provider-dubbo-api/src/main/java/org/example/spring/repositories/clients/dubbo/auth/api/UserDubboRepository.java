package org.example.spring.repositories.clients.dubbo.auth.api;

import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;

import java.util.Optional;

public interface UserDubboRepository extends CommonsDubboRepository<User, UserVo, UserDTO, UserQuery> {
    UserRoleDTO getWithRole(Long id);

    Optional<UserRoleDTO> getWithRoleOpt(Long id);

    UserRoleResourceDTO getWithRoleResource(Long id);

    Optional<UserRoleResourceDTO> getWithRoleResourceOpt(Long id);
}
