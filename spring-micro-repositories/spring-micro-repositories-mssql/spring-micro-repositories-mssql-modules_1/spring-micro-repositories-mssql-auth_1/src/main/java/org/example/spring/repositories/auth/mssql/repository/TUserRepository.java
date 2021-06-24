package org.example.spring.repositories.auth.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.auth.mssql.table.dto.TUserDTO;
import org.example.spring.repositories.auth.mssql.table.dto.TUserRoleDTO;
import org.example.spring.repositories.auth.mssql.table.dto.TUserRoleResourceDTO;
import org.example.spring.repositories.auth.mssql.table.po.TUser;
import org.example.spring.repositories.auth.mssql.table.query.TUserQuery;
import org.example.spring.repositories.auth.mssql.table.vo.TUserVo;

import java.util.List;

@Deprecated
public interface TUserRepository extends IBaseRepository<TUser, TUserDTO, TUserVo, TUserQuery> {
    TUserRoleResourceDTO getWithRoleAndResource(Long id);

    TUserRoleDTO getWithRole(Long id);

    void updateStatus(UserStatus status, List<Long> ids);

    void updateStatus(UserStatus status, Long... ids);

    void updateStatus(UserStatus status, Long id);
}
