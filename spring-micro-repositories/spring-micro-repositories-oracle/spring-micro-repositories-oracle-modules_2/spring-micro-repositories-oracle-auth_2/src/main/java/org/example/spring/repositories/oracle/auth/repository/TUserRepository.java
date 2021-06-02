package org.example.spring.repositories.oracle.auth.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.commons.enumerate.TUserStatus;
import org.example.spring.repositories.oracle.auth.table.dto.TUserDTO;
import org.example.spring.repositories.oracle.auth.table.dto.TUserRoleDTO;
import org.example.spring.repositories.oracle.auth.table.dto.TUserRoleResourceDTO;
import org.example.spring.repositories.oracle.auth.table.po.TUser;
import org.example.spring.repositories.oracle.auth.table.query.TUserQuery;
import org.example.spring.repositories.oracle.auth.table.vo.TUserVo;

import java.util.List;

public interface TUserRepository extends IBaseRepository<TUser, TUserDTO, TUserVo, TUserQuery> {
    TUserRoleResourceDTO getWithRoleAndResource(Long id);

    TUserRoleDTO getWithRole(Long id);

    void updateStatus(TUserStatus status, List<Long> ids);

    void updateStatus(TUserStatus status, Long... ids);

    void updateStatus(TUserStatus status, Long id);
}
