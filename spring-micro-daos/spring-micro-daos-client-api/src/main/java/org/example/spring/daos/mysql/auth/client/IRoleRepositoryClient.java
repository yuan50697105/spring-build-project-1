package org.example.spring.daos.mysql.auth.client;

import org.example.spring.daos.mysql.auth.entity.dto.RoleDTO;
import org.example.spring.daos.mysql.auth.entity.query.RoleQuery;
import org.example.spring.daos.mysql.auth.entity.vo.RoleVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("role/dao")
public interface IRoleRepositoryClient {

    @PostMapping
    void save(@RequestBody RoleVo RoleVo);

    @PutMapping
    void update(RoleVo RoleVo);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    RoleDTO get(@PathVariable Long id);

    @GetMapping("get")
    Optional<RoleVo> get(@SpringQueryMap RoleQuery query);

    @GetMapping("list")
    List<RoleVo> list(RoleQuery query);

    @GetMapping("data")
    IPageData<RoleVo> data(RoleQuery query);

}
