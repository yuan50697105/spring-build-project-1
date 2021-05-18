package org.example.spring.models.commons.repository.impl;

import org.example.spring.models.commons.entity.IModelVo;
import org.example.spring.models.commons.repository.IBaseRepository;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

import java.util.List;
import java.util.Optional;

/**
 * @author yuane
 */
@SuppressWarnings({"SpringJavaAutowiredMembersInspection", "unused"})
public abstract class IBaseRepositoryImpl<T, V extends IModelVo, D, Q extends BaseQuery> implements IBaseRepository<T, V, D, Q> {
    @Override
    public void save(V v) {
        saveWithId(v);
    }

    @Override
    public Optional<T> getByIdOpt(Long id) {
        return Optional.ofNullable(getById(id));
    }

    @Override
    public Optional<D> getDetailsByIdOpt(Long id) {
        return Optional.ofNullable(getDetailsById(id));
    }

    @Override
    public T queryFirst(Q q) {
        return queryTop(q, 1).stream().findFirst().orElse(null);
    }

    @Override
    public Optional<T> queryFirstOpt(Q q) {
        return Optional.ofNullable(queryFirst(q));
    }

    @Override
    public Optional<T> queryOneOpt(Q q) {
        return Optional.ofNullable(queryOne(q));
    }

    @Override
    public List<T> queryTop(Q q, int size) {
        q.setPage(1);
        q.setSize(size);
        return queryPage(q).getData();
    }


}