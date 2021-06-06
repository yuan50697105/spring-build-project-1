package org.example.spring.domains.services.postgres.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.services.impl.DServiceImpl;
import org.example.spring.domains.services.postgres.auth.service.DRoleService;
import org.example.spring.repositories.clients.auth.api.RoleRepository;
import org.example.spring.repositories.commons.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.auth.dto.RoleResourceDTO;
import org.example.spring.repositories.commons.auth.po.Role;
import org.example.spring.repositories.commons.auth.query.RoleQuery;
import org.example.spring.repositories.commons.auth.vo.RoleVo;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DRoleServiceImpl extends DServiceImpl<Role, RoleVo, RoleDTO, RoleQuery, RoleRepository> implements DRoleService {
    @Override
    public RoleResourceDTO getWithResource(Long id) {
        return null;
    }

}