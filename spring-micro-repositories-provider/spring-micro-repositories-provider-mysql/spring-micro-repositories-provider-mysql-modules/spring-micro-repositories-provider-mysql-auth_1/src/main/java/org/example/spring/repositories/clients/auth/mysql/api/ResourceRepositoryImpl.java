package org.example.spring.repositories.clients.auth.mysql.api;


import cn.hutool.core.lang.tree.Tree;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.ResourceRepository;
import org.example.spring.repositories.clients.auth.mysql.converter.ResourceRepositoryConverter;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@AllArgsConstructor
@Repository
public class ResourceRepositoryImpl implements ResourceRepository {
    private final org.example.spring.repositories.mysql.auth.repository.ResourceRepository repository;

    @Override
    public void save(ResourceVo vo) {
        repository.save(vo);
    }

    @Override
    public void save(ResourceVo... vo) {
        repository.save(Arrays.asList(vo));
    }

    @Override
    public void save(List<ResourceVo> vo) {
        repository.save(vo);
    }

    @Override
    public void update(ResourceVo vo) {
        repository.update(vo);
    }

    @Override
    public void update(ResourceVo... vo) {
        repository.update(Arrays.asList(vo));
    }

    @Override
    public void update(List<ResourceVo> vo) {
        repository.update(vo);
    }

    @Override
    public void update(ResourceVo vo, ResourceQuery query) {
        repository.update(vo, query);
    }

    @Override
    public void updateNull(ResourceVo vo) {
        repository.updateNull(vo);
    }

    @Override
    public void updateNull(ResourceVo vo, ResourceQuery query) {
        repository.updateNull(vo, query);
    }

    @Override
    public void updateNull(ResourceVo... vo) {
        repository.updateNull(Arrays.asList(vo));
    }

    @Override
    public void updateNull(List<ResourceVo> vo) {
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
    public ResourceDTO get(Long id) {
        return repository.get(id);
    }

    @Override
    public Optional<ResourceDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<ResourceDTO> listByIds(Long... ids) {
        return repository.listByIds(ids);
    }

    @Override
    public List<ResourceDTO> listByIds(List<Long> ids) {
        return repository.listByIds(ids);
    }

    @Override
    public Stream<ResourceDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<ResourceDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public ResourceDTO one(ResourceQuery query) {
        return repository.queryOne(query);
    }

    @Override
    public Optional<ResourceDTO> oneOpt(ResourceQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public ResourceDTO first(ResourceQuery query) {
        return repository.queryFirst(query);
    }

    @Override
    public Optional<ResourceDTO> firstOpt(ResourceQuery query) {
        return Optional.of(first(query));
    }

    @Override
    public List<ResourceDTO> list(ResourceQuery query) {
        return repository.queryList(query);
    }

    @Override
    public Stream<ResourceDTO> listStream(ResourceQuery query) {
        return repository.queryStream(query);
    }

    @Override
    public List<ResourceDTO> top(ResourceQuery query) {
        return repository.queryTop(query);
    }

    @Override
    public Stream<ResourceDTO> topStream(ResourceQuery query) {
        return repository.queryTopStream(query);
    }

    @Override
    public IPageData<ResourceDTO> data(ResourceQuery query) {
        return repository.queryPage(query);
    }

    @Override
    public List<Tree<Long>> queryTreeByUserId(Long id) {
        return repository.queryTreeByUserId(id);
    }

    @Override
    public List<Tree<Long>> queryTreeList(ResourceQuery query) {
        return repository.queryTree(query);
    }

}