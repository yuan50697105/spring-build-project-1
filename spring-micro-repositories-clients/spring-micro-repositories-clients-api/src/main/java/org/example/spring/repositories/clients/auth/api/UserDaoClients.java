package org.example.spring.repositories.clients.auth.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.constant.AuthClientConstants;
import org.example.spring.repositories.commons.auth.dto.UserDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.auth.query.UserQuery;
import org.example.spring.repositories.commons.auth.vo.UserVo;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RequestMapping(AuthClientConstants.DAOS_USER)
public interface UserDaoClients {
    @PostMapping
    UserVo save(UserVo vo);

    @PutMapping
    void update(UserVo vo);

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    UserDTO get(@PathVariable Long id);

    @GetMapping("/{id}/opt")
    Optional<UserDTO> getOpt(@PathVariable Long id);

    @GetMapping("{id}/role")
    UserRoleDTO getWithRole(@PathVariable Long id);

    @GetMapping("one")
    UserDTO one(@SpringQueryMap UserQuery query);

    @GetMapping("one/opt")
    Optional<UserDTO> oneOpt(@SpringQueryMap UserQuery query);

    @GetMapping("first")
    UserDTO first(@SpringQueryMap UserQuery query);

    @GetMapping("first/opt")
    Optional<UserDTO> firstOpt(@SpringQueryMap UserQuery query);

    @GetMapping("{id}/role/opt")
    Optional<UserRoleDTO> getWithRoleOpt(@PathVariable Long id);

    @GetMapping("list")
    List<UserDTO> list(@SpringQueryMap UserQuery query);

    @GetMapping("list/stream")
    Stream<UserDTO> listStream(@SpringQueryMap UserQuery query);

    @GetMapping("top")
    List<UserDTO> top(@SpringQueryMap UserQuery query);

    @GetMapping("top/stream")
    Stream<UserDTO> topStream(@SpringQueryMap UserQuery query);

    @GetMapping
    IPageData<UserDTO> data(@SpringQueryMap UserQuery query);

}
