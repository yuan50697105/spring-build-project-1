package org.example.spring.repositories.clients.commons.api;

import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface CommonsRepository<T, V, D, Q> {
    void save(V vo);

    void save(V... vo);

    void save(List<V> vo);

    void update(V vo);

    void update(V... vo);

    void update(List<V> vo);

    void update(V vo, Q q);

    void updateNull(V vo);

    void updateNull(V vo, Q q);

    void updateNull(V... vo);

    void updateNull(List<V> vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    D get(Long id);

    Optional<D> getOpt(Long id);

    List<D> listByIds(Long... ids);

    List<D> listByIds(List<Long> ids);

    Stream<D> streamByIds(Long... ids);

    Stream<D> streamByIds(List<Long> ids);

    D one(Q query);

    Optional<D> oneOpt(Q query);

    D first(Q query);

    Optional<D> firstOpt(Q query);

    List<D> list(Q query);

    Stream<D> listStream(Q query);

    List<D> top(Q query);

    Stream<D> topStream(Q query);

    IPageData<D> data(Q query);
}