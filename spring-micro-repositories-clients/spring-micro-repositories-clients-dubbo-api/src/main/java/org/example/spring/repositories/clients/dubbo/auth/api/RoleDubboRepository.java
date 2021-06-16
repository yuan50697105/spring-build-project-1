package org.example.spring.repositories.clients.dubbo.auth.api;

import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.po.Role;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;

public interface RoleDubboRepository extends CommonsDubboRepository<Role, RoleVo, RoleDTO, RoleQuery> {
}
