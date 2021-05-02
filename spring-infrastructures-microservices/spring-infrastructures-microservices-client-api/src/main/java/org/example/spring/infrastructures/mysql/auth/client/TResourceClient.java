package org.example.spring.infrastructures.mysql.auth.client;

import org.example.spring.infrastructures.mysql.auth.entity.ITResource;
import org.example.spring.infrastructures.mysql.auth.entity.query.ITResourceQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("resource")
public interface TResourceClient {
    @PostMapping
    void save(@RequestBody ITResource resource);

    @PutMapping
    void update(@RequestBody ITResource resource);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    ITResource get(@PathVariable Long id);

    @GetMapping
    Optional<ITResource> get(@SpringQueryMap ITResourceQuery query);

    @GetMapping("list")
    List<ITResource> list(@SpringQueryMap ITResourceQuery query);

    @GetMapping
    IPageData<ITResource> data(@SpringQueryMap ITResourceQuery query);

}
