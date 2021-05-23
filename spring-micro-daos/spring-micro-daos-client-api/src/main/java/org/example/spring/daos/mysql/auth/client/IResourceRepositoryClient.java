package org.example.spring.daos.mysql.auth.client;

import org.example.spring.daos.mysql.auth.entity.dto.ResourceDTO;
import org.example.spring.daos.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.daos.mysql.auth.entity.vo.ResourceVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("resource/dao")
public interface IResourceRepositoryClient {
    @PostMapping
    void save(@RequestBody ResourceVo resourceVo);

    @PutMapping
    void update(@RequestBody ResourceVo resourceVo);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    ResourceDTO get(@PathVariable Long id);

    @GetMapping
    Optional<ResourceDTO> get(@SpringQueryMap ResourceQuery query);

    @GetMapping("list")
    List<ResourceDTO> list(@SpringQueryMap ResourceQuery query);

    @GetMapping
    IPageData<ResourceDTO> data(@SpringQueryMap ResourceQuery query);

}
