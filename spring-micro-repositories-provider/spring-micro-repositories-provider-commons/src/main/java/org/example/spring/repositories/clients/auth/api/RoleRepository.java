package org.example.spring.repositories.clients.auth.api;


import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.RoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Role;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;

import java.util.Optional;

public interface RoleRepository extends CommonsRepository<Role, RoleVo, RoleDTO, RoleQuery> {
    RoleResourceDTO getRoleResource(Long id);

    Optional<RoleResourceDTO> getRoleResourceOpt(Long id);
}
