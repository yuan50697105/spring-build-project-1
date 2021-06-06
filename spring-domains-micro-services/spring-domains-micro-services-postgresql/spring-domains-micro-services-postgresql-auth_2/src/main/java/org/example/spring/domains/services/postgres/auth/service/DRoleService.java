package org.example.spring.domains.services.postgres.auth.service;

import org.example.spring.domains.services.DService;
import org.example.spring.repositories.commons.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.auth.dto.RoleResourceDTO;
import org.example.spring.repositories.commons.auth.po.Role;
import org.example.spring.repositories.commons.auth.query.RoleQuery;
import org.example.spring.repositories.commons.auth.vo.RoleVo;

public interface DRoleService extends DService<Role, RoleVo, RoleDTO, RoleQuery> {
    RoleResourceDTO getWithResource(Long id);
}
