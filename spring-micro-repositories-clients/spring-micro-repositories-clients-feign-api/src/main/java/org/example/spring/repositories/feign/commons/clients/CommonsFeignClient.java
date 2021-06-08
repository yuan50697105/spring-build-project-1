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


    @PutMapping("update")
    void update(V vo);


    @DeleteMapping("delete/{id}")
    void delete(@PathVariable Long id);


    @DeleteMapping("delete")
    void delete(Long... ids);


    @DeleteMapping("delete/list")
    void delete(List<Long> ids);


    @GetMapping("get/{id}")
    D get(@PathVariable Long id);


    @GetMapping("get/opt/{id}")
    Optional<D> getOpt(@PathVariable Long id);


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
