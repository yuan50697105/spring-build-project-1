package org.example.spring.applications.web.auth.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import cn.hutool.core.lang.tree.Tree;
import lombok.AllArgsConstructor;
import org.example.spring.domains.mysql.auth.service.ResourceService;
import org.example.spring.models.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.models.mysql.auth.entity.result.ResourceDetails;
import org.example.spring.models.mysql.auth.entity.vo.ResourceModelVo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("resource")
@AllArgsConstructor
public class ResourceController {
    private final ResourceService resourceService;

    @GetMapping("list/{id}")
    public WebAsyncTask<Result<List<Tree<Long>>>> listByUserId(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            List<Tree<Long>> data = resourceService.listResourceByUserId(id);
            return R.success(data);
        });
    }

    @GetMapping
    public WebAsyncTask<Result<List<Tree<Long>>>> data(ResourceQuery query) {
        return new WebAsyncTask<>(() -> {
            return R.success(resourceService.selectTreeList(query));
        });
    }

    @GetMapping("{id}")
    public WebAsyncTask<Result<ResourceDetails>> get(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            ResourceDetails details = resourceService.get(id);
            return R.success(details);
        });
    }

    @PostMapping
    public WebAsyncTask<Result<?>> save(@RequestBody ResourceModelVo formVo) {
        return new WebAsyncTask<>(() -> {
            resourceService.save(formVo);
            return R.success();
        });
    }

    @PutMapping
    public WebAsyncTask<Result<?>> update(@RequestBody ResourceModelVo formVo) {
        return new WebAsyncTask<>(() -> {
            resourceService.update(formVo);
            return R.success();
        });
    }


    @PutMapping("{id}")
    public WebAsyncTask<Result<?>> update(@RequestBody ResourceModelVo formVo, @PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            resourceService.update((ResourceModelVo) formVo.withId(id));
            return R.success();
        });
    }

    @DeleteMapping("{id}")
    public WebAsyncTask<Result<?>> delete(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            resourceService.delete(Collections.singletonList(id));
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public WebAsyncTask<Result<?>> delete1(@RequestParam List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            resourceService.delete(ids);
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public WebAsyncTask<Result<?>> delete2(@RequestBody List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            resourceService.delete(ids);
            return R.success();
        });
    }
}