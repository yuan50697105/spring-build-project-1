package org.example.spring.repositories.feign.auth.clients;


import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@RequestMapping("user/repository/client")
public interface UserRepositoryClient extends CommonsFeignClient<User, UserVo, UserDTO, UserQuery> {

    @GetMapping(" get/with/role/{id}")
    UserRoleDTO getWithRole(@PathVariable Long id);

    @GetMapping("get/with/role/opt/{id}")
    Optional<UserRoleDTO> getWithRoleOpt(@PathVariable Long id);

    @GetMapping("get/with/role/resource/{id}")
    UserRoleResourceDTO getWithRoleResource(@PathVariable Long id);

    @GetMapping("get/with/role/resource/opt/{id}")
    Optional<UserRoleResourceDTO> getWithRoleResourceOpt(@PathVariable Long id);

}
