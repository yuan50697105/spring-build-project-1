package org.example.spring.repositories.clients.auth.api;


import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;

import java.util.Optional;

public interface UserRepository extends CommonsRepository<User, UserVo, UserDTO, UserQuery> {


    UserRoleDTO getWithRole(Long id);

    Optional<UserRoleDTO> getWithRoleOpt(Long id);

    UserRoleResourceDTO getWithRoleResource(Long id);

    Optional<UserRoleResourceDTO> getWithRoleResourceOpt(Long id);

}
