package org.example.spring.repositories.feign.auth.clients.impl;

import org.example.spring.repositories.clients.auth.api.RoleRepository;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.po.Role;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;
import org.example.spring.repositories.feign.auth.clients.RoleRepositoryClient;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleRepositoryClientImpl extends CommonsFeignClientImpl<Role, RoleVo, RoleDTO, RoleQuery, RoleRepository> implements RoleRepositoryClient {
    public RoleRepositoryClientImpl(RoleRepository repository) {
        super(repository);
    }
}