package org.example.spring.repositories.commons.micro.repositories.auth;

import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.RoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Role;
import org.example.spring.repositories.commons.entity.auth.po.RoleResource;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;
import org.example.spring.repositories.commons.micro.repositories.commons.CommonsRepository;

public interface RoleRepository extends CommonsRepository<Role, RoleVo, RoleDTO, RoleQuery> {
    RoleResourceDTO getWithResource(Long id);
}
