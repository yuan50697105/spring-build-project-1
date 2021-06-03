package org.example.spring.auth;

import org.example.spring.auth.converter.UserClientsConverter;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.commons.auth.dto.UserDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.auth.query.UserQuery;
import org.example.spring.repositories.commons.auth.vo.UserVo;
import org.example.spring.repositories.mysql.auth.repository.TUserRepository;
import org.example.spring.repositories.mysql.auth.table.dto.TUserDTO;
import org.example.spring.repositories.mysql.auth.table.query.TUserQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TUserVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final TUserRepository userRepository;
    private final UserClientsConverter userClientsConverter;

    public UserRepositoryImpl(TUserRepository userRepository, UserClientsConverter userClientsConverter) {
        this.userRepository = userRepository;
        this.userClientsConverter = userClientsConverter;
    }

    @Override
    public UserVo save(UserVo vo) {
        TUserVo build = userClientsConverter.build(vo);
        userRepository.save(build);

        return userClientsConverter.convert(build);
    }

    @Override
    public void update(UserVo vo) {
        userRepository.update(userClientsConverter.build(vo));
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }

    @Override
    public void delete(List<Long> ids) {
        userRepository.delete(ids);
    }

    @Override
    public UserDTO get(Long id) {
        return userClientsConverter.build(userRepository.get(id));
    }

    @Override
    public Optional<UserDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public UserRoleDTO getWithRole(Long id) {
        return userClientsConverter.buildWithRole(userRepository.getWithRole(id));
    }

    @Override
    public UserDTO one(UserQuery query) {
        TUserQuery userQuery = userClientsConverter.build(query);
        TUserDTO DTO = userRepository.queryOne(userQuery);
        return userClientsConverter.build(DTO);
    }

    @Override
    public Optional<UserDTO> oneOpt(UserQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public UserDTO first(UserQuery query) {
        TUserQuery userQuery = userClientsConverter.build(query);
        TUserDTO DTO = userRepository.queryFirst(userQuery);
        return userClientsConverter.build(DTO);
    }

    @Override
    public Optional<UserDTO> firstOpt(UserQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public Optional<UserRoleDTO> getWithRoleOpt(Long id) {
        return Optional.of(getWithRole(id));
    }

    @Override
    public List<UserDTO> list(UserQuery query) {
        TUserQuery userQuery = userClientsConverter.build(query);
        List<TUserDTO> DTO = userRepository.queryList(userQuery);
        return userClientsConverter.build(DTO);
    }

    @Override
    public Stream<UserDTO> listStream(UserQuery query) {
        return list(query).stream();
    }

    @Override
    public List<UserDTO> top(UserQuery query) {
        TUserQuery userQuery = userClientsConverter.build(query);
        List<TUserDTO> DTO = userRepository.queryTop(userQuery);
        return userClientsConverter.build(DTO);
    }

    @Override
    public Stream<UserDTO> topStream(UserQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<UserDTO> data(UserQuery query) {
        TUserQuery userQuery = userClientsConverter.build(query);
        IPageData<TUserDTO> DTO = userRepository.queryPage(userQuery);
        return userClientsConverter.build(DTO);
    }
}