package org.example.spring.repositories.clients.auth.mysql.feign;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.auth.api.RoleRepository;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.po.Role;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;
import org.example.spring.repositories.feign.auth.clients.RoleRepositoryClient;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class RoleRepositoryController extends CommonsFeignClientImpl<Role, RoleVo, RoleDTO, RoleQuery, RoleRepository> implements RoleRepositoryClient {
    public RoleRepositoryController(RoleRepository repository) {
        super(repository);
    }
}