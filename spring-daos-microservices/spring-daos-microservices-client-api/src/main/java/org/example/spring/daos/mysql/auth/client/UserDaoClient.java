package org.example.spring.daos.mysql.auth.client;

import org.example.spring.daos.mysql.auth.entity.User;
import org.example.spring.daos.mysql.auth.entity.details.UserDetails;
import org.example.spring.daos.mysql.auth.entity.query.UserQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

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

    @GetMapping("/{id}/details")
    UserDetails getDetails(@PathVariable Long id);

    @GetMapping("/{id}")
    User get(@PathVariable Long id);

    @GetMapping("opt/{id}")
    Optional<User> getOpt(@PathVariable Long id);

    @GetMapping("get")
    Optional<User> getByQuery(@SpringQueryMap UserQuery query);

    @GetMapping("list")
    List<User> listByQuery(UserQuery query);

    @GetMapping("top")
    List<User> topByQuery(@SpringQueryMap UserQuery query);

    @GetMapping("list/stream")
    Stream<User> listStreamByQuery(@SpringQueryMap UserQuery query);

    @GetMapping("top/stream")
    Stream<User> topStreamByQuery(@SpringQueryMap UserQuery query);

    @GetMapping("data")
    IPageData<User> dataByQuery(@SpringQueryMap UserQuery query);
}
