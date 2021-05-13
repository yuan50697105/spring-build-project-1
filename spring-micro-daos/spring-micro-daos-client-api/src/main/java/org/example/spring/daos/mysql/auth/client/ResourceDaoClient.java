package org.example.spring.daos.mysql.auth.client;

import org.example.spring.daos.mysql.auth.entity.Resource;
import org.example.spring.daos.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("resource")
public interface ResourceDaoClient {
    @PostMapping
    void save(@RequestBody Resource resource);

    @PutMapping
    void update(@RequestBody Resource resource);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    Resource get(@PathVariable Long id);

    @GetMapping
    Optional<Resource> get(@SpringQueryMap ResourceQuery query);

    @GetMapping("list")
    List<Resource> list(@SpringQueryMap ResourceQuery query);

    @GetMapping
    IPageData<Resource> data(@SpringQueryMap ResourceQuery query);

}
