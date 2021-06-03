package org.example.spring.domains.services.postgres.auth.service;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.postgres.auth.table.dto.TUserDTO;
import org.example.spring.repositories.postgres.auth.table.dto.TUserRoleDTO;
import org.example.spring.repositories.postgres.auth.table.dto.TUserRoleResourceDTO;
import org.example.spring.repositories.postgres.auth.table.query.TUserQuery;
import org.example.spring.repositories.postgres.auth.table.vo.TUserVo;

import java.util.List;

public interface DAccountService {

    IPageData<TUserDTO> queryPage(TUserQuery query);

    List<TUserDTO> queryList(TUserQuery query);

    TUserDTO queryOne(TUserQuery query);

    TUserDTO get(Long id);

    TUserRoleDTO getWithRole(Long id);

    TUserRoleResourceDTO getWithRoleAndResource(Long id);

    void save(TUserVo vo);

    void update(TUserVo vo);

    void delete(List<Long> ids);

    void delete(Long... ids);

    void delete(Long id);

    void updateStatus(UserStatus status, List<Long> ids);
}
