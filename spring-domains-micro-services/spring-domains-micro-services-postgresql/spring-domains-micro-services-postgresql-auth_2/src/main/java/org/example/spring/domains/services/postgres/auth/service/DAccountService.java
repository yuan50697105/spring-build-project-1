package org.example.spring.domains.services.postgres.auth.service;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.UserDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.auth.query.UserQuery;
import org.example.spring.repositories.commons.auth.vo.UserVo;
import org.example.spring.repositories.commons.enumerate.UserStatus;

import java.util.List;

public interface DAccountService {

    IPageData<UserDTO> queryPage(UserQuery query);

    List<UserDTO> queryList(UserQuery query);

    List<UserDTO> queryTop(UserQuery query);

    UserDTO queryOne(UserQuery query);

    UserDTO get(Long id);

    UserRoleDTO getWithRole(Long id);

    UserRoleResourceDTO getWithRoleAndResource(Long id);

    void save(UserVo vo);

    void update(UserVo vo);

    void delete(List<Long> ids);

    void delete(Long... ids);

    void delete(Long id);

    void updateStatus(UserStatus status, List<Long> ids);
}
