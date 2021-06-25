package org.example.spring.domains.services.impl;

import org.example.spring.domains.services.DService;
import org.example.spring.plugins.commons.entity.ICommonsEntity;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;
import org.example.spring.repositories.clients.commons.api.CommonsRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public abstract class DServiceImpl<T extends ICommonsEntity, V extends T, D extends T, Q extends ICommonsQuery, R extends CommonsRepository<T, V, D, Q>> implements DService<T, V, D, Q> {
    protected R repository;

    @Override
    public void save(V vo) {
        repository.save(vo);
    }

    @Override
    public void update(V vo) {
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
    public D get(Long id) {
        return repository.get(id);
    }

    @Override
    public Optional<D> getOpt(Long id) {
        return repository.getOpt(id);
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