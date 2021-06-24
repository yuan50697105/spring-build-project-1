package org.example.spring.repositories.clients.auth.postgres.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.clients.auth.postgres.converter.UserRepositoryConverter;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.auth.postgres.repository.TUserRepository;
import org.example.spring.repositories.auth.postgres.table.dto.TUserDTO;
import org.example.spring.repositories.auth.postgres.table.dto.TUserRoleDTO;
import org.example.spring.repositories.auth.postgres.table.query.TUserQuery;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


@Repository
public class UserRepositoryImpl implements UserRepository {

    private final TUserRepository repository;
    private final UserRepositoryConverter converter;

    public UserRepositoryImpl(TUserRepository repository, UserRepositoryConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public void save(UserVo vo) {
        repository.save(converter.buildVo(vo));
    }

    @Override
    public void save(UserVo... vo) {
        repository.save(converter.buildVo(Arrays.asList(vo)));
    }

    @Override
    public void save(List<UserVo> vo) {
        repository.save(converter.buildVo(vo));
        ;
    }

    @Override
    public void update(UserVo vo) {
        repository.update(converter.buildVo(vo));
    }

    @Override
    public void update(UserVo... vo) {
        repository.update(converter.buildVo(Arrays.asList(vo)));
    }

    @Override
    public void update(List<UserVo> vo) {
        repository.update(converter.buildVo(vo));
    }

    @Override
    public void update(UserVo vo, UserQuery userQuery) {
        repository.update(converter.buildVo(vo), converter.build(userQuery));
    }

    @Override
    public void updateNull(UserVo vo) {
        repository.updateNull(converter.buildVo(vo));
    }

    @Override
    public void updateNull(UserVo vo, UserQuery userQuery) {
        repository.updateNull(converter.buildVo(vo), converter.build(userQuery));
    }

    @Override
    public void updateNull(UserVo... vo) {
        repository.updateNull(converter.buildVo(Arrays.asList(vo)));
    }

    @Override
    public void updateNull(List<UserVo> vo) {
        repository.updateNull(converter.buildVo(vo));
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public void delete(Long... ids) {
        repository.delete(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        repository.delete(ids);
    }

    @Override
    public UserDTO get(Long id) {
        return converter.build(repository.get(id));
    }

    @Override
    public Optional<UserDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<UserDTO> listByIds(Long... ids) {
        return converter.build(repository.listByIds(ids));
    }

    @Override
    public List<UserDTO> listByIds(List<Long> ids) {
        return converter.build(repository.listByIds(ids));
    }

    @Override
    public Stream<UserDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<UserDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public UserRoleDTO getWithRole(Long id) {
        TUserRoleDTO tUserRoleDTO = repository.getWithRole(id);
        UserRoleDTO userRoleDTO = converter.buildWithRole(tUserRoleDTO);
        userRoleDTO.setRoles(converter.buildRole(tUserRoleDTO.getRoles()));
        return userRoleDTO;
    }

    @Override
    public UserDTO one(UserQuery query) {
        TUserQuery userQuery = converter.build(query);
        TUserDTO DTO = repository.queryOne(userQuery);
        return converter.build(DTO);
    }

    @Override
    public Optional<UserDTO> oneOpt(UserQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public UserDTO first(UserQuery query) {
        TUserQuery userQuery = converter.build(query);
        TUserDTO DTO = repository.queryFirst(userQuery);
        return converter.build(DTO);
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
    public UserRoleResourceDTO getWithRoleResource(Long id) {
//        TUserRoleResourceDTO tUserRoleResourceDTO = userRepository.getWithRoleAndResource(id);
//        UserRoleResourceDTO userRoleResourceDTO = userRepositoryConverter.buildWithRoleResource(tUserRoleResourceDTO);
//        userRoleResourceDTO.setRoles(userRepositoryConverter.buildRole(tUserRoleResourceDTO.getRoles()));
//        if (ObjectUtil.isNotEmpty(tUserRoleResourceDTO.getResources())) {
//            userRoleResourceDTO.setResources(userRepositoryConverter.buildResources(tUserRoleResourceDTO.getResources()));
//        }
//        return userRoleResourceDTO;
        return null;
    }

    @Override
    public Optional<UserRoleResourceDTO> getWithRoleResourceOpt(Long id) {
        return Optional.ofNullable(getWithRoleResource(id));
    }

    @Override
    public List<UserDTO> list(UserQuery query) {
        TUserQuery userQuery = converter.build(query);
        List<TUserDTO> DTO = repository.queryList(userQuery);
        return converter.build(DTO);
    }

    @Override
    public Stream<UserDTO> listStream(UserQuery query) {
        return list(query).stream();
    }

    @Override
    public List<UserDTO> top(UserQuery query) {
        TUserQuery userQuery = converter.build(query);
        List<TUserDTO> DTO = repository.queryTop(userQuery);
        return converter.build(DTO);
    }

    @Override
    public Stream<UserDTO> topStream(UserQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<UserDTO> data(UserQuery query) {
        TUserQuery userQuery = converter.build(query);
        IPageData<TUserDTO> DTO = repository.queryPage(userQuery);
        return converter.build(DTO);
    }
}