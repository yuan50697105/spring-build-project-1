package org.example.spring.repositories.feign.commons.clients.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.entity.ICommonsEntity;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;
import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public abstract class CommonsFeignClientImpl<T extends ICommonsEntity, V extends T, D extends T, Q extends ICommonsQuery, R extends CommonsRepository<T, V, D, Q>> implements CommonsFeignClient<T, V, D, Q> {
    private final R repository;

    @Override
    public void save(V vo) {
        repository.save(vo);
    }

    @Override
    public void save(List<V> vo) {
        repository.save(vo);
    }

    @Override
    public void update(V vo) {
        repository.update(vo);
    }

    @Override
    public void update(List<V> vo) {
        repository.update(vo);
    }

    @Override
    public void updateNull(V vo) {
        repository.updateNull(vo);
    }

    @Override
    public void updateNull(List<V> vo) {
        repository.updateNull(vo);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public void delete(List<Long> ids) {
        repository.delete(ids);
    }

    @Override
    public D get(Long id) {
        return repository.get(id);
    }

    @Override
    public Optional<D> getOpt(Long id) {
        return Optional.ofNullable(repository.get(id));
    }

    @Override
    public List<D> listByIds(List<Long> ids) {
        return repository.listByIds(ids);
    }

    @Override
    public Stream<D> streamByIds(List<Long> ids) {
        return repository.streamByIds(ids);
    }

    @Override
    public D one(Q query) {
        return repository.one(query);
    }

    @Override
    public Optional<D> oneOpt(Q query) {
        return Optional.ofNullable(repository.one(query));
    }

    @Override
    public D first(Q query) {
        return repository.first(query);
    }

    @Override
    public Optional<D> firstOpt(Q query) {
        return Optional.ofNullable(repository.first(query));
    }

    @Override
    public List<D> list(Q query) {
        return repository.list(query);
    }

    @Override
    public Stream<D> listStream(Q query) {
        return repository.listStream(query);
    }

    @Override
    public List<D> top(Q query) {
        return repository.top(query);
    }

    @Override
    public Stream<D> topStream(Q query) {
        return repository.topStream(query);
    }

    @Override
    public IPageData<D> data(Q query) {
        return repository.data(query);
    }
}