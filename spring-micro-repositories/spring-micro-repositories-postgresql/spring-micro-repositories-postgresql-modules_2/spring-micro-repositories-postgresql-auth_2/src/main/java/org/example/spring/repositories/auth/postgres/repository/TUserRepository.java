package org.example.spring.repositories.auth.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.auth.postgres.table.dto.TUserDTO;
import org.example.spring.repositories.auth.postgres.table.dto.TUserRoleDTO;
import org.example.spring.repositories.auth.postgres.table.dto.TUserRoleResourceDTO;
import org.example.spring.repositories.auth.postgres.table.po.TUser;
import org.example.spring.repositories.auth.postgres.table.query.TUserQuery;
import org.example.spring.repositories.auth.postgres.table.vo.TUserVo;

import java.util.List;

@Deprecated
public interface TUserRepository extends IBaseRepository<TUser, TUserDTO, TUserVo, TUserQuery> {
    TUserRoleResourceDTO getWithRoleAndResource(Long id);

    TUserRoleDTO getWithRole(Long id);

    void updateStatus(UserStatus status, List<Long> ids);

    void updateStatus(UserStatus status, Long... ids);

    void updateStatus(UserStatus status, Long id);
}
