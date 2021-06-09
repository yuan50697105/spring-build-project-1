package org.example.spring.repositories.clients.auth.mysql.api;

import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.clients.auth.mysql.converter.UserRepositoryConverter;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.mysql.auth.repository.TUserRepository;
import org.example.spring.repositories.mysql.auth.table.dto.TUserDTO;
import org.example.spring.repositories.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.repositories.mysql.auth.table.query.TUserQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TUserVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


@Repository
public  class UserRepositoryImpl implements UserRepository {

    private final TUserRepository userRepository;
    private final UserRepositoryConverter userRepositoryConverter;

    public UserRepositoryImpl(TUserRepository userRepository, UserRepositoryConverter userRepositoryConverter) {
        this.userRepository = userRepository;
        this.userRepositoryConverter = userRepositoryConverter;
    }

    @Override
    public void save(UserVo vo) {
        TUserVo build = userRepositoryConverter.build(vo);
        userRepository.save(build);
    }

    @Override
    public void update(UserVo vo) {
        userRepository.update(userRepositoryConverter.build(vo));
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }

    @Override
    public void delete(Long... ids) {
        userRepository.delete(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        userRepository.delete(ids);
    }

    @Override
    public UserDTO get(Long id) {
        return userRepositoryConverter.build(userRepository.get(id));
    }

    @Override
    public Optional<UserDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public UserRoleDTO getWithRole(Long id) {
        TUserRoleDTO tUserRoleDTO = userRepository.getWithRole(id);
        UserRoleDTO userRoleDTO = userRepositoryConverter.buildWithRole(tUserRoleDTO);
        userRoleDTO.setRoles(userRepositoryConverter.buildRole(tUserRoleDTO.getRoles()));
        return userRoleDTO;
    }

    @Override
    public UserDTO one(UserQuery query) {
        TUserQuery userQuery = userRepositoryConverter.build(query);
        TUserDTO DTO = userRepository.queryOne(userQuery);
        return userRepositoryConverter.build(DTO);
    }

    @Override
    public Optional<UserDTO> oneOpt(UserQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public UserDTO first(UserQuery query) {
        TUserQuery userQuery = userRepositoryConverter.build(query);
        TUserDTO DTO = userRepository.queryFirst(userQuery);
        return userRepositoryConverter.build(DTO);
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
        TUserQuery userQuery = userRepositoryConverter.build(query);
        List<TUserDTO> DTO = userRepository.queryList(userQuery);
        return userRepositoryConverter.build(DTO);
    }

    @Override
    public Stream<UserDTO> listStream(UserQuery query) {
        return list(query).stream();
    }

    @Override
    public List<UserDTO> top(UserQuery query) {
        TUserQuery userQuery = userRepositoryConverter.build(query);
        List<TUserDTO> DTO = userRepository.queryTop(userQuery);
        return userRepositoryConverter.build(DTO);
    }

    @Override
    public Stream<UserDTO> topStream(UserQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<UserDTO> data(UserQuery query) {
        TUserQuery userQuery = userRepositoryConverter.build(query);
        IPageData<TUserDTO> DTO = userRepository.queryPage(userQuery);
        return userRepositoryConverter.build(DTO);
    }
}