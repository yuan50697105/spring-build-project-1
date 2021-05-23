package org.example.spring.daos.mysql.auth.client;

import org.example.spring.daos.mysql.auth.entity.dto.UserDTO;
import org.example.spring.daos.mysql.auth.entity.dto.UserRoleDTO;
import org.example.spring.daos.mysql.auth.entity.query.UserQuery;
import org.example.spring.daos.mysql.auth.entity.vo.UserVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RequestMapping("user/dao")
public interface IUserRepositoryClient {
    @PostMapping
    void save(@RequestBody UserVo userVo);

    @PutMapping
    void update(UserVo userVo);

    @PutMapping("/{status}")
    void updateStatusByIds(@PathVariable String status, List<Long> ids);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}/details")
    UserRoleDTO getDetails(@PathVariable Long id);

    @GetMapping("/{id}")
    UserDTO get(@PathVariable Long id);

    @GetMapping("opt/{id}")
    Optional<UserDTO> getOpt(@PathVariable Long id);

    Optional<UserRoleDTO> getDetailsOpt(Long id);

    UserDTO queryOneByQuery(UserQuery query);

    @GetMapping("get")
    Optional<UserDTO> queryOneByQueryOpt(@SpringQueryMap UserQuery query);

    UserDTO queryFirstByQuery(UserQuery query);

    Optional<UserDTO> queryFirstByQueryOpt(UserQuery query);

    @GetMapping("list")
    List<UserDTO> queryListByQuery(UserQuery query);

    @GetMapping("top")
    List<UserDTO> queryTopByQuery(@SpringQueryMap UserQuery query);

    @GetMapping("list/stream")
    Stream<UserDTO> queryListStreamByQuery(@SpringQueryMap UserQuery query);

    @GetMapping("top/stream")
    Stream<UserDTO> queryTopStreamByQuery(@SpringQueryMap UserQuery query);

    @GetMapping("data")
    IPageData<UserDTO> queryPageByQuery(@SpringQueryMap UserQuery query);
}
