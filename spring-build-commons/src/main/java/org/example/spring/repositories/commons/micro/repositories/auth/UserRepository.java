package org.example.spring.repositories.commons.micro.repositories.auth;

import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.commons.micro.repositories.commons.CommonsRepository;

public interface UserRepository extends CommonsRepository<User, UserVo, UserDTO, UserQuery> {
    UserRoleDTO getWithRole(Long id);

    UserRoleResourceDTO getWithRoleResource(Long id);
}
