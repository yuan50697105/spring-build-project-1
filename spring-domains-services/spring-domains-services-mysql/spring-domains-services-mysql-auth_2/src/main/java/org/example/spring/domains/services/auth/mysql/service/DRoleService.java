package org.example.spring.domains.services.auth.mysql.service;

import org.example.spring.domains.services.DService;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.RoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Role;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;

public interface DRoleService extends DService<Role, RoleVo, RoleDTO, RoleQuery> {
    RoleResourceDTO getWithResource(Long id);
}
