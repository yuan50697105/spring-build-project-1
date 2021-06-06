package org.example.spring.repositories.clients.postgres.postgres.api;

import lombok.AllArgsConstructor;
import org.example.spring.repositories.clients.auth.api.UserTokenRepository;
import org.example.spring.repositories.clients.postgres.postgres.converter.UserTokenRepositoryConverter;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.UserTokenDto;
import org.example.spring.repositories.commons.auth.query.UserTokenQuery;
import org.example.spring.repositories.commons.auth.vo.UserTokenVo;
import org.example.spring.repositories.postgres.auth.repository.TUserTokenRepository;
import org.example.spring.repositories.postgres.auth.table.dto.TUserTokenDto;
import org.example.spring.repositories.postgres.auth.table.query.TUserTokenQuery;
import org.example.spring.repositories.postgres.auth.table.vo.TUserTokenVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


@AllArgsConstructor
@Repository
public  class UserTokenRepositoryImpl implements UserTokenRepository {
    private final UserTokenRepositoryConverter converter;
    private final TUserTokenRepository repository;

    @Override
    public void save(UserTokenVo vo) {
        TUserTokenVo tUserTokenVo = converter.build(vo);
        repository.save(tUserTokenVo);
    }

    @Override
    public void update(UserTokenVo vo) {
        TUserTokenVo tUserTokenVo = converter.build(vo);
        repository.update(tUserTokenVo);
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
        TUserTokenDto tUserTokenDto = repository.get(id);
        return converter.buildDto(tUserTokenDto);
    }

    @Override
    public Optional<UserTokenDto> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public UserTokenDto one(UserTokenQuery query) {
        TUserTokenQuery tokenQuery = converter.buildQuery(query);
        TUserTokenDto dto = repository.queryOne(tokenQuery);
        return converter.buildDto(dto);
    }

    @Override
    public Optional<UserTokenDto> oneOpt(UserTokenQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public UserTokenDto first(UserTokenQuery query) {
        TUserTokenQuery tokenQuery = converter.buildQuery(query);
        TUserTokenDto dto = repository.queryFirst(tokenQuery);
        return converter.buildDto(dto);
    }

    @Override
    public Optional<UserTokenDto> firstOpt(UserTokenQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<UserTokenDto> list(UserTokenQuery query) {
        TUserTokenQuery tokenQuery = converter.buildQuery(query);
        List<TUserTokenDto> dtos = repository.queryList(tokenQuery);
        return converter.buildDto(dtos);
    }

    @Override
    public Stream<UserTokenDto> listStream(UserTokenQuery query) {
        return list(query).stream();
    }

    @Override
    public List<UserTokenDto> top(UserTokenQuery query) {
        TUserTokenQuery tokenQuery = converter.buildQuery(query);
        List<TUserTokenDto> dtos = repository.queryTop(tokenQuery);
        return converter.buildDto(dtos);
    }

    @Override
    public Stream<UserTokenDto> topStream(UserTokenQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<UserTokenDto> data(UserTokenQuery query) {
        TUserTokenQuery tokenQuery = converter.buildQuery(query);
        IPageData<TUserTokenDto> dtos = repository.queryPage(tokenQuery);
        return converter.buildDto(dtos);
    }
}