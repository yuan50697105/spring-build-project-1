package org.example.spring.domains.services;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.commons.api.CommonsRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface DService<T, V, D, Q>  {

    void save(V vo);

    void update(V vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    D get(Long id);

    Optional<D> getOpt(Long id);

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
