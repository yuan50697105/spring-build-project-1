package org.example.spring.repositories.clients.auth.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.UserDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.auth.query.UserQuery;
import org.example.spring.repositories.commons.auth.vo.UserVo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface UserRepository {
    UserVo save(UserVo vo);

    void update(UserVo vo);

    void delete(Long id);

    void delete(List<Long> ids);

    UserDTO get(Long id);

    Optional<UserDTO> getOpt(Long id);

    UserRoleDTO getWithRole(Long id);

    UserDTO one(UserQuery query);

    Optional<UserDTO> oneOpt(UserQuery query);

    UserDTO first(UserQuery query);

    Optional<UserDTO> firstOpt(UserQuery query);

    Optional<UserRoleDTO> getWithRoleOpt(Long id);

    List<UserDTO> list(UserQuery query);

    Stream<UserDTO> listStream(UserQuery query);

    List<UserDTO> top(UserQuery query);

    Stream<UserDTO> topStream(UserQuery query);

    IPageData<UserDTO> data(UserQuery query);

}
