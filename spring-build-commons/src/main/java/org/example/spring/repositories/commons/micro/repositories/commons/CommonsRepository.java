package org.example.spring.repositories.commons.micro.repositories.commons;

import org.example.spring.plugins.commons.entity.ICommonsEntity;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface CommonsRepository<T extends ICommonsEntity, V extends T, D extends T, Q extends ICommonsQuery> {
    void save(V v);

    void update(V v);

    void updateNull(V v);

    void update(V v, Q q);

    void updateNull(V v, Q q);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    D get(Long id);

    D queryOne(Q q);

    Optional<D> queryOpt(Q q);

    D queryFirst(Q q);

    Optional<D> queryFirstOpt(Q q);

    List<D> queryList(Q q);

    List<D> queryTop(Q q);

    Stream<D> queryStream(Q q);

    Stream<D> queryTopStream(Q q);

    IPageData<D> queryPage(Q q);

}
