package org.example.spring.repositories.clients.auth.mysql.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


@Repository
public class UserRepositoryImpl implements UserRepository {
    private final org.example.spring.repositories.mysql.auth.repository.UserRepository repository;

    public UserRepositoryImpl(org.example.spring.repositories.mysql.auth.repository.UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public void save(UserVo vo) {
        repository.save(vo);
    }

    @Override
    public void save(UserVo... vo) {
        repository.save(vo);
    }

    @Override
    public void save(List<UserVo> vo) {
        repository.save(vo);
    }

    @Override
    public void update(UserVo vo) {
        repository.update(vo);
    }

    @Override
    public void update(UserVo... vo) {
        repository.update(vo);
    }

    @Override
    public void update(List<UserVo> vo) {
        repository.update(vo);
    }

    @Override
    public void update(UserVo vo, UserQuery userQuery) {
        repository.update(vo, userQuery);
    }

    @Override
    public void updateNull(UserVo vo) {
        repository.updateNull(vo);
    }

    @Override
    public void updateNull(UserVo vo, UserQuery userQuery) {
        repository.updateNull(vo, userQuery);
    }

    @Override
    public void updateNull(UserVo... vo) {
        repository.updateNull(vo);
    }

    @Override
    public void updateNull(List<UserVo> vo) {
        repository.updateNull(vo);
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
        return repository.get(id);
    }

    @Override
    public Optional<UserDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<UserDTO> listByIds(Long... ids) {
        return repository.listByIds(ids);
    }

    @Override
    public List<UserDTO> listByIds(List<Long> ids) {
        return repository.listByIds(ids);
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
        return repository.getWithRole(id);
    }

    @Override
    public UserDTO one(UserQuery query) {
        return repository.queryOne(query);
    }

    @Override
    public Optional<UserDTO> oneOpt(UserQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public UserDTO first(UserQuery query) {
        return repository.queryFirst(query);
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
        return repository.getWithRoleAndResource(id);
    }

    @Override
    public Optional<UserRoleResourceDTO> getWithRoleResourceOpt(Long id) {
        return Optional.ofNullable(getWithRoleResource(id));
    }

    @Override
    public List<UserDTO> list(UserQuery query) {
        return repository.queryList(query);
    }

    @Override
    public Stream<UserDTO> listStream(UserQuery query) {
        return list(query).stream();
    }

    @Override
    public List<UserDTO> top(UserQuery query) {
        return repository.queryTop(query);
    }

    @Override
    public Stream<UserDTO> topStream(UserQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<UserDTO> data(UserQuery query) {
        return repository.queryPage(query);
    }
}