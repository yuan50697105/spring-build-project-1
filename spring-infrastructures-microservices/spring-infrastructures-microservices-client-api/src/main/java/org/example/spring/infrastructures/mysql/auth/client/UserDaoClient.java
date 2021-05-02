package org.example.spring.infrastructures.mysql.auth.client;

import org.example.spring.infrastructures.mysql.auth.entity.User;
import org.example.spring.infrastructures.mysql.auth.entity.query.UserQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("user")
public interface UserDaoClient {
    @PostMapping
    void save(@RequestBody User user);

    @PutMapping
    void update(User user);

    @PutMapping("/{status}")
    void updateStatusByIds(@PathVariable String status, List<Long> ids);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    User get(@PathVariable Long id);

    @GetMapping("get")
    Optional<User> get(@SpringQueryMap UserQuery query);

    @GetMapping("list")
    List<User> list(UserQuery query);

    @GetMapping("data")
    IPageData<User> data(UserQuery query);
}
