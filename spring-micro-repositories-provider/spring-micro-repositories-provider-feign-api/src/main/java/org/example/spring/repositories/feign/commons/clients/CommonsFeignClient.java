package org.example.spring.repositories.feign.commons.clients;

import org.example.spring.plugins.commons.entity.ICommonsEntity;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface CommonsFeignClient<T extends ICommonsEntity, V extends T, D extends T, Q extends ICommonsQuery> {
    @PostMapping("save")
    void save(@RequestBody V vo);

    @PostMapping("save/batch")
    void save(@RequestBody List<V> vo);

    @PutMapping("update")
    void update(@RequestBody V vo);

    @PutMapping("update/batch")
    void update(@RequestBody List<V> vo);

    @DeleteMapping("delete/{id}")
    void delete(@PathVariable Long id);

    @DeleteMapping("delete/list")
    void delete(List<Long> ids);

    @GetMapping("get/{id}")
    D get(@PathVariable Long id);

    @GetMapping("get/opt/{id}")
    Optional<D> getOpt(@PathVariable Long id);

    @GetMapping("list")
    List<D> listByIds(@PathVariable List<Long> ids);

    @GetMapping("stream")
    Stream<D> streamByIds(@PathVariable List<Long> ids);

    @GetMapping("query/one")
    D one(@SpringQueryMap Q query);

    @GetMapping("query/one/opt")
    Optional<D> oneOpt(@SpringQueryMap Q query);


    @GetMapping("query/first")
    D first(@SpringQueryMap Q query);


    @GetMapping("query/first/opt")
    Optional<D> firstOpt(@SpringQueryMap Q query);


    @GetMapping("query/list")
    List<D> list(@SpringQueryMap Q query);


    @GetMapping("query/list/stream")
    Stream<D> listStream(@SpringQueryMap Q query);


    @GetMapping("query/top")
    List<D> top(@SpringQueryMap Q query);


    @GetMapping("query/top/stream")
    Stream<D> topStream(@SpringQueryMap Q query);


    @GetMapping("query/data")
    IPageData<D> data(@SpringQueryMap Q query);
}
