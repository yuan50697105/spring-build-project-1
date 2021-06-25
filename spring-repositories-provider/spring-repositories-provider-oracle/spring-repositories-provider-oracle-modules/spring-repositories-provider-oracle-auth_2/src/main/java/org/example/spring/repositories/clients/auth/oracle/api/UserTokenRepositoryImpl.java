package org.example.spring.repositories.clients.auth.oracle.api;


import lombok.AllArgsConstructor;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.UserTokenRepository;
import org.example.spring.repositories.commons.entity.auth.dto.UserTokenDto;
import org.example.spring.repositories.commons.entity.auth.query.UserTokenQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserTokenVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@AllArgsConstructor
@Repository
public class UserTokenRepositoryImpl implements UserTokenRepository {
    private final org.example.spring.repositories.auth.oracle.repository.UserTokenRepository repository;

    @Override
    public void save(UserTokenVo vo) {
        repository.save(vo);
    }

    @Override
    public void save(UserTokenVo... vo) {
        repository.save(vo);
    }

    @Override
    public void save(List<UserTokenVo> vo) {
        repository.save(vo);
    }

    @Override
    public void update(UserTokenVo vo) {
        repository.update(vo);
    }

    @Override
    public void update(UserTokenVo... vo) {
        repository.update(vo);
    }

    @Override
    public void update(List<UserTokenVo> vo) {
        repository.update(vo);
    }

    @Override
    public void update(UserTokenVo vo, UserTokenQuery userTokenQuery) {
        repository.update(vo, userTokenQuery);

    }

    @Override
    public void updateNull(UserTokenVo vo) {
        repository.update(vo);
    }

    @Override
    public void updateNull(UserTokenVo vo, UserTokenQuery userTokenQuery) {
        repository.update(vo, userTokenQuery);
    }

    @Override
    public void updateNull(UserTokenVo... vo) {
        repository.update(vo);
    }

    @Override
    public void updateNull(List<UserTokenVo> vo) {
        repository.update(vo);
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
    public UserTokenDto get(Long id) {
        return repository.get(id);
    }

    @Override
    public Optional<UserTokenDto> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<UserTokenDto> listByIds(Long... ids) {
        return repository.listByIds(ids);
    }

    @Override
    public List<UserTokenDto> listByIds(List<Long> ids) {
        return repository.listByIds(ids);
    }

    @Override
    public Stream<UserTokenDto> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<UserTokenDto> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public UserTokenDto one(UserTokenQuery query) {
        return repository.queryOne(query);
    }

    @Override
    public Optional<UserTokenDto> oneOpt(UserTokenQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public UserTokenDto first(UserTokenQuery query) {
        return repository.queryFirst(query);
    }

    @Override
    public Optional<UserTokenDto> firstOpt(UserTokenQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<UserTokenDto> list(UserTokenQuery query) {
        return repository.queryList(query);
    }

    @Override
    public Stream<UserTokenDto> listStream(UserTokenQuery query) {
        return list(query).stream();
    }

    @Override
    public List<UserTokenDto> top(UserTokenQuery query) {
        return repository.queryTop(query);
    }

    @Override
    public Stream<UserTokenDto> topStream(UserTokenQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<UserTokenDto> data(UserTokenQuery query) {
        return repository.queryPage(query);
    }

}