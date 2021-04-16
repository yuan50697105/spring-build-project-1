package org.exmaple.spring.models.commons;

import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;
import java.util.Optional;

public interface CommonsModelRepository<T, V, D, Q> {
    void save(V v);

    Long saveWithId(V v);

    D getById(Long id);

    List<T> listByIds(List<Long> ids);

    Optional<D> getByIdOpt(Long id);

    T queryOne(Q q);

    Optional<T> queryOneOpt(Q q);

    T queryFirst(Q q);

    Optional<T> queryFirstOpt(Q q);

    List<T> queryList(Q q);

    List<T> queryTop(Q q);

    IPageData<T> queryPage(Q q);


}
