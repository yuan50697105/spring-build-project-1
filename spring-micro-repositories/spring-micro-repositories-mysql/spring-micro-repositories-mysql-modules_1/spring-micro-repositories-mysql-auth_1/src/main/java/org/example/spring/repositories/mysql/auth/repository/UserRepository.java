package org.example.spring.repositories.mysql.auth.repository;

import org.example.spring.plugins.mybatis.repository.ICommonsRepository;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.repositories.mysql.auth.table.dto.TUserRoleResourceDTO;

import java.util.List;

public interface UserRepository extends ICommonsRepository<User, UserDTO, UserVo, UserQuery> {
    UserRoleResourceDTO getWithRoleAndResource(Long id);

    UserRoleDTO getWithRole(Long id);

    void updateStatus(UserStatus status, List<Long> ids);

    void updateStatus(UserStatus status, Long... ids);

    void updateStatus(UserStatus status, Long id);
}
