package org.example.spring.repositories.clients.auth.api;

import org.example.spring.repositories.clients.auth.constant.AuthClientConstants;
import org.example.spring.repositories.clients.auth.entity.*;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RequestMapping(AuthClientConstants.DAOS_USER)
public interface UserDaoClients {
    @PostMapping
    CUserVo save(CUserVo vo);

    @PutMapping
    void update(CUserVo vo);

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    CUserDto get(@PathVariable Long id);

    @GetMapping("/{id}/opt")
    Optional<CUserDto> getOpt(@PathVariable Long id);

    @GetMapping("{id}/role")
    CUserRoleDto getWithRole(@PathVariable Long id);

    @GetMapping("one")
    CUserDto one(@SpringQueryMap CUserQuery query);

    @GetMapping("one/opt")
    Optional<CUserDto> oneOpt(@SpringQueryMap CUserQuery query);

    @GetMapping("first")
    CUserDto first(@SpringQueryMap CUserQuery query);

    @GetMapping("first/opt")
    Optional<CUserDto> firstOpt(@SpringQueryMap CUserQuery query);

    @GetMapping("{id}/role/opt")
    Optional<CUserRoleDto> getWithRoleOpt(@PathVariable Long id);

    @GetMapping("list")
    List<CUserDto> list(@SpringQueryMap CUserQuery query);

    @GetMapping("list/stream")
    Stream<CUserDto> listStream(@SpringQueryMap CUserQuery query);

    @GetMapping("top")
    List<CUserDto> top(@SpringQueryMap CUserQuery query);

    @GetMapping("top/stream")
    Stream<CUserDto> topStream(@SpringQueryMap CUserQuery query);

    @GetMapping
    IPageData<CUserDto> data(@SpringQueryMap CUserQuery query);

}
