package org.example.spring.repositories.feign.auth.clients;


import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.RoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Role;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@RequestMapping("user/repository/client")
public interface RoleRepositoryClient extends CommonsFeignClient<Role, RoleVo, RoleDTO, RoleQuery> {
    @GetMapping("get/role/resource/{id}")
    RoleResourceDTO getRoleResource(@PathVariable Long id);

    @GetMapping("get/role/resource/opt/{id}")
    Optional<RoleResourceDTO> getRoleResourceOpt(@PathVariable Long id);
}
