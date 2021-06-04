package org.example.spring.domains.services.mysql.auth.service;

import org.example.spring.domains.services.DService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.UserDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.auth.po.User;
import org.example.spring.repositories.commons.auth.query.UserQuery;
import org.example.spring.repositories.commons.auth.vo.UserVo;
import org.example.spring.repositories.commons.enumerate.UserStatus;

import java.util.List;

public interface DAccount2Service extends DService<User,UserVo,UserDTO,UserQuery> {


    UserRoleDTO getWithRole(Long id);

    UserRoleResourceDTO getWithRoleAndResource(Long id);

    void updateStatus(UserStatus status, List<Long> ids);
}
