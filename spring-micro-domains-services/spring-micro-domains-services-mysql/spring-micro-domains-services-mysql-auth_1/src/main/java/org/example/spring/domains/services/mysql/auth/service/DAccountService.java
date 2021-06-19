package org.example.spring.domains.services.mysql.auth.service;

import ai.yue.library.base.view.Result;
import org.example.spring.domains.services.DService;
import org.example.spring.domains.services.mysql.auth.dto.RegisterResult;
import org.example.spring.domains.services.mysql.auth.vo.RegisterVo;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.commons.enumerate.UserStatus;

import java.util.List;

public interface DAccountService extends DService<User, UserVo, UserDTO, UserQuery> {
    UserRoleDTO getWithRole(Long id);

    UserRoleResourceDTO getWithRoleResource(Long id);

    void updateStatus(UserStatus status, List<Long> ids);

    void updateStatus(UserStatus status, Long... ids);

    void updateStatus(UserStatus status, Long id);

    Result<RegisterResult> register(RegisterVo registerVo);
}
