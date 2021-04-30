package org.example.spring.infrastructures.mysql.auth.client;

import org.example.spring.infrastructures.mysql.auth.entity.ITRole;
import org.example.spring.infrastructures.mysql.auth.entity.query.ITRoleQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("role")
public interface TRoleClient {

    @PostMapping
    void save(@RequestBody ITRole Role);

    @PutMapping
    void update(ITRole Role);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    ITRole get(@PathVariable Long id);

    @GetMapping("get")
    Optional<ITRole> get(@SpringQueryMap ITRoleQuery query);

    @GetMapping("list")
    List<ITRole> list(ITRoleQuery query);

    @GetMapping("data")
    IPageData<ITRole> data(ITRoleQuery query);

}
