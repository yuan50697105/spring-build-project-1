package org.example.spring.repositories.feign.auth.clients;

import org.example.spring.repositories.clients.auth.api.RoleRepository;
import org.example.spring.repositories.commons.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.auth.po.Role;
import org.example.spring.repositories.commons.auth.query.RoleQuery;
import org.example.spring.repositories.commons.auth.vo.RoleVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("user/repository/client")
public interface RoleRepositoryClient extends CommonsFeignClient<Role, RoleVo, RoleDTO, RoleQuery>, RoleRepository {
}
