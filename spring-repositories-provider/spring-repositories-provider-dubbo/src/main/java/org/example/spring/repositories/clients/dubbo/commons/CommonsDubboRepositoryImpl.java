package org.example.spring.repositories.clients.dubbo.commons;

import org.example.spring.plugins.commons.entity.ICommonsEntity;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;
import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public abstract class CommonsDubboRepositoryImpl<T extends ICommonsEntity, V extends T, D extends T, Q extends ICommonsQuery, R extends CommonsRepository<T, V, D, Q>> implements CommonsDubboRepository<T, V, D, Q> {
    private final R repository;

    protected CommonsDubboRepositoryImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public void save(V vo) {
        repository.save(vo);
    }

    @Override
    public void save(V... vo) {
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
    public void update(V... vo) {
        repository.update(vo);
    }

    @Override
    public void update(List<V> vo) {
        repository.update(vo);
    }

    @Override
    public void update(V vo, Q q) {
        repository.update(vo, q);
    }

    @Override
    public void updateNull(V vo) {
        repository.updateNull(vo);
    }

    @Override
    public void updateNull(V vo, Q q) {
        repository.updateNull(vo, q);
    }

    @Override
    public void updateNull(V... vo) {
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
    public void delete(Long... ids) {
        repository.delete(ids);
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
        return repository.getOpt(id);
    }

    @Override
    public List<D> listByIds(Long... ids) {
        return repository.listByIds(ids);
    }

    @Override
    public List<D> listByIds(List<Long> ids) {
        return repository.listByIds(ids);
    }

    @Override
    public Stream<D> streamByIds(Long... ids) {
        return repository.streamByIds(ids);
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
        return repository.oneOpt(query);
    }

    @Override
    public D first(Q query) {
        return repository.first(query);
    }

    @Override
    public Optional<D> firstOpt(Q query) {
        return repository.firstOpt(query);
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