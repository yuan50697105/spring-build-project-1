package org.example.spring.repositories.clients.auth.mysql.api;

import lombok.AllArgsConstructor;
import org.example.spring.repositories.clients.auth.api.RoleRepository;
import org.example.spring.repositories.clients.auth.mysql.converter.RoleRepositoryConverter;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;
import org.example.spring.repositories.mysql.auth.repository.TRoleRepository;
import org.example.spring.repositories.mysql.auth.table.vo.TRoleVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


@AllArgsConstructor
@Repository
public  class RoleRepositoryImpl implements RoleRepository {
    private final RoleRepositoryConverter converter;
    private final TRoleRepository repository;

    @Override
    public void save(RoleVo vo) {
        TRoleVo tRoleVo = converter.build(vo);
        repository.save(tRoleVo);
    }

    @Override
    public void update(RoleVo vo) {
        TRoleVo tRoleVo = converter.build(vo);
        repository.update(tRoleVo);
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
    public RoleDTO get(Long id) {
        return converter.build(repository.get(id));
    }

    @Override
    public Optional<RoleDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public RoleDTO one(RoleQuery query) {
        return converter.build(repository.queryOne(converter.build(query)));
    }

    @Override
    public Optional<RoleDTO> oneOpt(RoleQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public RoleDTO first(RoleQuery query) {
        return converter.build(repository.queryFirst(converter.build(query)));
    }

    @Override
    public Optional<RoleDTO> firstOpt(RoleQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<RoleDTO> list(RoleQuery query) {
        return converter.build(repository.queryList(converter.build(query)));
    }

    @Override
    public Stream<RoleDTO> listStream(RoleQuery query) {
        return list(query).stream();
    }

    @Override
    public List<RoleDTO> top(RoleQuery query) {
        return converter.build(repository.queryTop(converter.build(query)));
    }

    @Override
    public Stream<RoleDTO> topStream(RoleQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<RoleDTO> data(RoleQuery query) {
        return converter.build(repository.queryPage(converter.build(query)));
    }
}