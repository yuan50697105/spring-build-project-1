package org.example.spring.repositories.auth.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.auth.oracle.table.dto.TUserDTO;
import org.example.spring.repositories.auth.oracle.table.dto.TUserRoleDTO;
import org.example.spring.repositories.auth.oracle.table.dto.TUserRoleResourceDTO;
import org.example.spring.repositories.auth.oracle.table.po.TUser;
import org.example.spring.repositories.auth.oracle.table.query.TUserQuery;
import org.example.spring.repositories.auth.oracle.table.vo.TUserVo;

import java.util.List;

@Deprecated
public interface TUserRepository extends IBaseRepository<TUser, TUserDTO, TUserVo, TUserQuery> {
    TUserRoleResourceDTO getWithRoleAndResource(Long id);

    TUserRoleDTO getWithRole(Long id);

    void updateStatus(UserStatus status, List<Long> ids);

    void updateStatus(UserStatus status, Long... ids);

    void updateStatus(UserStatus status, Long id);
}
