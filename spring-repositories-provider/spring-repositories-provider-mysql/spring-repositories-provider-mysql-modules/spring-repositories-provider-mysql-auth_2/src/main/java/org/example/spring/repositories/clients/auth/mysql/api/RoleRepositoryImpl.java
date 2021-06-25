package org.example.spring.repositories.clients.auth.mysql.api;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.RoleRepository;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.RoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


@AllArgsConstructor
@Repository
public class RoleRepositoryImpl implements RoleRepository {
    private final org.example.spring.repositories.auth.mysql.repository.RoleRepository repository;

    @Override
    public void save(RoleVo vo) {
        repository.save(vo);
    }

    @Override
    public void save(RoleVo... vo) {
        repository.save(vo);
    }

    @Override
    public void save(List<RoleVo> vo) {
        repository.save(vo);
    }

    @Override
    public void update(RoleVo vo) {
        repository.update(vo);
    }

    @Override
    public void update(RoleVo... vo) {
        repository.update(vo);
    }

    @Override
    public void update(List<RoleVo> vo) {
        repository.update(vo);
    }

    @Override
    public void update(RoleVo vo, RoleQuery roleQuery) {
        repository.update(vo, roleQuery);
    }

    @Override
    public void updateNull(RoleVo vo) {
        repository.updateNull(vo);
    }

    @Override
    public void updateNull(RoleVo vo, RoleQuery roleQuery) {
        repository.updateNull(vo);
    }

    @Override
    public void updateNull(RoleVo... vo) {
        repository.updateNull(vo);
    }

    @Override
    public void updateNull(List<RoleVo> vo) {
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
    public RoleDTO get(Long id) {
        return repository.get(id);
    }

    @Override
    public Optional<RoleDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<RoleDTO> listByIds(Long... ids) {
        return repository.listByIds(ids);
    }

    @Override
    public List<RoleDTO> listByIds(List<Long> ids) {
        return repository.listByIds(ids);
    }

    @Override
    public Stream<RoleDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<RoleDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public RoleDTO one(RoleQuery query) {
        return repository.queryOne(query);
    }

    @Override
    public Optional<RoleDTO> oneOpt(RoleQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public RoleDTO first(RoleQuery query) {
        return repository.queryFirst(query);
    }

    @Override
    public Optional<RoleDTO> firstOpt(RoleQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<RoleDTO> list(RoleQuery query) {
        return repository.queryList(query);
    }

    @Override
    public Stream<RoleDTO> listStream(RoleQuery query) {
        return list(query).stream();
    }

    @Override
    public List<RoleDTO> top(RoleQuery query) {
        return repository.queryTop(query);
    }

    @Override
    public Stream<RoleDTO> topStream(RoleQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<RoleDTO> data(RoleQuery query) {
        return repository.queryPage(query);
    }

    @Override
    public RoleResourceDTO getRoleResource(Long id) {
        return repository.getDetails(id);
    }

    @Override
    public Optional<RoleResourceDTO> getRoleResourceOpt(Long id) {
        return Optional.ofNullable(getRoleResource(id));
    }
}