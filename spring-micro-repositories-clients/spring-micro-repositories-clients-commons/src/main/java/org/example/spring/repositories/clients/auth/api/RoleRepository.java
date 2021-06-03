package org.example.spring.repositories.clients.auth.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.auth.po.Role;
import org.example.spring.repositories.commons.auth.query.RoleQuery;
import org.example.spring.repositories.commons.auth.vo.RoleVo;

public interface RoleRepository extends CommonsRepository<Role, RoleVo, RoleDTO, RoleQuery> {
}
