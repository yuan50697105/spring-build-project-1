package org.example.spring.repositories.feign.commons.clients;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface CommonsFeignClient<T, V, D, Q> extends CommonsRepository<T, V, D, Q> {
    @Override
    @PostMapping("save")
    void save(@RequestBody V vo);

    @Override
    @PutMapping("update")
    void update(V vo);

    @Override
    @DeleteMapping("delete/{id}")
    void delete(@PathVariable Long id);

    @Override
    @DeleteMapping("delete")
    void delete(Long... ids);

    @Override
    @DeleteMapping("delete/list")
    void delete(List<Long> ids);

    @Override
    @GetMapping("get/{id}")
    D get(@PathVariable Long id);

    @Override
    @GetMapping("get/opt/{id}")
    Optional<D> getOpt(@PathVariable Long id);

    @Override
    @GetMapping("query/one")
    D one(@SpringQueryMap Q query);

    @Override
    @GetMapping("query/one/opt")
    Optional<D> oneOpt(@SpringQueryMap Q query);

    @Override
    @GetMapping("query/first")
    D first(@SpringQueryMap Q query);

    @Override
    @GetMapping("query/first/opt")
    Optional<D> firstOpt(@SpringQueryMap Q query);

    @Override
    @GetMapping("query/list")
    List<D> list(@SpringQueryMap Q query);

    @Override
    @GetMapping("query/list/stream")
    Stream<D> listStream(@SpringQueryMap Q query);

    @Override
    @GetMapping("query/top")
    List<D> top(@SpringQueryMap Q query);

    @Override
    @GetMapping("query/top/stream")
    Stream<D> topStream(@SpringQueryMap Q query);

    @Override
    @GetMapping("query/data")
    IPageData<D> data(@SpringQueryMap Q query);
}
