package org.example.spring.plugins.commons.repository;

import org.example.spring.plugins.commons.entity.query.BaseQuery;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;
import java.util.Optional;

/**
 * @author yuane
 */
@SuppressWarnings("UnusedReturnValue")
public interface IBaseRepository<T, V, D, Q extends BaseQuery> {

    default void save(V v) {
        saveWithId(v);
    }

    Long saveWithId(V v);

    void update(V v);

    void delete(List<Long> ids);

    T getById(Long id);

    default Optional<T> getByIdOpt(Long id) {
        return Optional.ofNullable(getById(id));
    }

    D getDetailsById(Long id);

    default Optional<D> getDetailsByIdOpt(Long id) {
        return Optional.ofNullable(getDetailsById(id));
    }

    IPageData<T> queryPage(Q q);

    List<T> queryList(Q q);

    T queryOne(Q q);

    default Optional<T> queryOneOpt(Q q) {
        return Optional.ofNullable(queryOne(q));
    }

    default List<T> queryTop(Q q, int size) {
        q.setPage(1);
        q.setSize(size);
        return queryPage(q).getData();
    }

    default T queryFirst(Q q) {
        return queryTop(q, 1).stream().findFirst().orElse(null);
    }

    default Optional<T> queryFirstOpt(Q q) {
        return Optional.ofNullable(queryFirst(q));
    }
}
