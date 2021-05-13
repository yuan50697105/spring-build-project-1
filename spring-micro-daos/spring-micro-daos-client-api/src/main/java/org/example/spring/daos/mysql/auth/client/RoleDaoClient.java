package org.example.spring.daos.mysql.auth.client;

import org.example.spring.daos.mysql.auth.entity.Role;
import org.example.spring.daos.mysql.auth.entity.query.RoleQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("role")
public interface RoleDaoClient {

    @PostMapping
    void save(@RequestBody Role Role);

    @PutMapping
    void update(Role Role);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    Role get(@PathVariable Long id);

    @GetMapping("get")
    Optional<Role> get(@SpringQueryMap RoleQuery query);

    @GetMapping("list")
    List<Role> list(RoleQuery query);

    @GetMapping("data")
    IPageData<Role> data(RoleQuery query);

}
