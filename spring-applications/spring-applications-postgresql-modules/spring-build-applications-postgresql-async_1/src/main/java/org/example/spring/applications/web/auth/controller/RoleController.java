package org.example.spring.applications.web.auth.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.postgresql.auth.service.RoleService;
import org.example.spring.models.postgresql.auth.entity.query.RoleQuery;
import org.example.spring.models.postgresql.auth.entity.result.Role;
import org.example.spring.models.postgresql.auth.entity.result.RoleDetails;
import org.example.spring.models.postgresql.auth.entity.vo.RoleModelVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
@RestController
@RequestMapping(value = "role", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@AllArgsConstructor
public class RoleController {
    private final RoleService roleService;

    @GetMapping
    public WebAsyncTask<Result<List<Role>>> queryPage(RoleQuery query) {
        return new WebAsyncTask<>(() -> {
            IPageData<Role> data = roleService.queryPage(query);
            return R.success(data.getTotalRowNum(), data.getData());
        });
    }

    @GetMapping("list")
    public WebAsyncTask<Result<List<Role>>> queryList(RoleQuery query) {
        return new WebAsyncTask<>(() -> {
            List<Role> data = roleService.queryList(query);
            return R.success((long) data.size(), data);
        });
    }

    @GetMapping("list/{size}")
    public WebAsyncTask<Result<List<Role>>> queryTop(RoleQuery query, @PathVariable int size) {
        return new WebAsyncTask<>(() -> {
            List<Role> data = roleService.queryList((RoleQuery) query.withSize(size));
            return R.success((long) data.size(), data);
        });
    }

    @GetMapping("one")
    public WebAsyncTask<Result<Role>> queryOne(RoleQuery query) {
        return new WebAsyncTask<>(() -> {
            Role data = roleService.queryOne(query);
            return R.success(data);
        });
    }

    @GetMapping("{id}")
    public WebAsyncTask<Result<RoleDetails>> get(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            RoleDetails data = roleService.get(id);
            return R.success(data);
        });
    }

    @PostMapping
    public WebAsyncTask<Result<?>> save(@RequestBody RoleModelVo formVo) {
        return new WebAsyncTask<>(() -> {
            roleService.save(formVo);
            return R.success();
        });
    }

    @PutMapping
    public WebAsyncTask<Result<?>> update(@RequestBody RoleModelVo formVo) {
        return new WebAsyncTask<>(() -> {
            roleService.update(formVo);
            return R.success();
        });
    }

    @PutMapping("{id}")
    public WebAsyncTask<Result<?>> update(@RequestBody RoleModelVo formVo, @PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            roleService.update((RoleModelVo) formVo.withId(id));
            return R.success();
        });
    }


    @DeleteMapping("{id}")
    public WebAsyncTask<Result<?>> delete(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            roleService.delete(Collections.singletonList(id));
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public WebAsyncTask<Result<?>> delete1(@RequestParam List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            roleService.delete(ids);
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public WebAsyncTask<Result<?>> delete2(@RequestBody List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            roleService.delete(ids);
            return R.success();
        });
    }


}