package org.example.spring.repositories.mysql.auth.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.auth.table.dto.TUserDTO;
import org.example.spring.repositories.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.repositories.mysql.auth.table.dto.TUserRoleResourceDTO;
import org.example.spring.repositories.mysql.auth.table.po.TUser;
import org.example.spring.repositories.mysql.auth.table.query.TUserQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TUserVo;
import org.example.spring.repositories.mysql.table.enumerate.TUserStatus;

import java.util.List;

public interface TUserRepository extends IBaseRepository<TUser, TUserDTO, TUserVo, TUserQuery> {
    TUserRoleResourceDTO getWithRoleAndResource(Long id);

    TUserRoleDTO getWithRole(Long id);

    void updateStatus(TUserStatus status, List<Long> ids);

    void updateStatus(TUserStatus status, Long... ids);

    void updateStatus(TUserStatus status, Long id);
}
