package org.example.spring.applications.web.auth.controller;


import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import cn.hutool.core.lang.tree.Tree;
import lombok.AllArgsConstructor;
import org.example.spring.domains.services.auth.mysql.service.DResourceService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
@RestController
@RequestMapping(value = "resource", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@AllArgsConstructor
public class ResourceController {
    private final DResourceService resourceService;

    @GetMapping("tree")
    public Result<List<Tree<Long>>> queryTree(ResourceQuery query) {
        List<Tree<Long>> data = resourceService.queryTreeList(query);
        return R.success(data);
    }

    @GetMapping
    public Result<IPageData<ResourceDTO>> queryPage(ResourceQuery query) {
        IPageData<ResourceDTO> data = resourceService.data(query);
        return R.success(data.getTotalRowNum(), data);
    }

    @GetMapping("list/{size}")
    public Result<List<ResourceDTO>> queryList(ResourceQuery query, @PathVariable int size) {
        List<ResourceDTO> data = resourceService.top((ResourceQuery) query.withSize(size));
        return R.success((long) data.size(), data);
    }

    @GetMapping("list")
    public Result<List<ResourceDTO>> queryList(ResourceQuery query) {
        List<ResourceDTO> data = resourceService.list(query);
        return R.success((long) data.size(), data);
    }

    @GetMapping("one")
    public Result<ResourceDTO> queryOne(ResourceQuery query) {
        ResourceDTO data = resourceService.one(query);
        return R.success(data);
    }

    @GetMapping("{id}")
    public Result<ResourceDTO> get(@PathVariable Long id) {
        ResourceDTO data = resourceService.get(id);
        return R.success(data);
    }

    @PostMapping
    public Result<?> save(@RequestBody ResourceVo formVo) {
        resourceService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody ResourceVo formVo) {
        resourceService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@RequestBody ResourceVo formVo, @PathVariable Long id) {
        formVo.setId(id);
        resourceService.update(formVo);
        return R.success();
    }


    @DeleteMapping("{id}")
    public Result<?> delete(@PathVariable Long id) {
        resourceService.delete(Collections.singletonList(id));
        return R.success();
    }

    @DeleteMapping
    public Result<?> delete(List<Long> ids) {
        resourceService.delete(ids);
        return R.success();
    }

}