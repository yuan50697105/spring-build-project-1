package org.example.spring.plugins.commons.repository;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

import java.util.List;
import java.util.Optional;

/**
 * @author yuane
 */
@SuppressWarnings("UnusedReturnValue")
public interface IBaseRepository<T, V, D, Q extends BaseQuery> {

    void save(V v);

    Long saveWithId(V v);

    void update(V v);

    void delete(List<Long> ids);

    T getById(Long id);

    Optional<T> getByIdOpt(Long id);


    D getDetailsById(Long id);

    Optional<D> getDetailsByIdOpt(Long id);

    IPageData<T> queryPage(Q q);

    List<T> queryList(Q q);

    T queryOne(Q q);

    Optional<T> queryOneOpt(Q q);

    List<T> queryTop(Q q, int size);


    T queryFirst(Q q);

    Optional<T> queryFirstOpt(Q q);
}
