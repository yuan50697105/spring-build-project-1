package org.example.spring.infrastructures.mysql.auth.client;

import org.example.spring.infrastructures.mysql.auth.entity.ITUser;
import org.example.spring.infrastructures.mysql.auth.entity.query.ITUserQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("user")
public interface TUserClient {
    @PostMapping
    void save(@RequestBody ITUser user);

    @PutMapping
    void update(ITUser user);

    @PutMapping("/{status}")
    void updateStatusByIds(@PathVariable String status, List<Long> ids);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    ITUser get(@PathVariable Long id);

    @GetMapping("get")
    Optional<ITUser> get(@SpringQueryMap ITUserQuery query);

    @GetMapping("list")
    List<ITUser> list(ITUserQuery query);

    @GetMapping("data")
    IPageData<ITUser> data(ITUserQuery query);
}
