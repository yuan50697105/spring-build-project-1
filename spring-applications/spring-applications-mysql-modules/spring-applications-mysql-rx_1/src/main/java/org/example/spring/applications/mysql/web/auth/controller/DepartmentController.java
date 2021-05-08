package org.example.spring.applications.mysql.web.auth.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.mysql.auth.service.DepartmentService;
import org.example.spring.models.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.models.mysql.auth.entity.result.Department;
import org.example.spring.models.mysql.auth.entity.result.DepartmentDetails;
import org.example.spring.models.mysql.auth.entity.vo.DepartmentModelVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("department")
@AllArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping
    public WebAsyncTask<Result<List<Department>>> selectPage(DepartmentQuery query) {
        return new WebAsyncTask<>(() -> {
            IPageData<Department> data = departmentService.selectPage(query);
            return R.success(data.getTotalRowNum(), data.getData());
        });
    }

    @GetMapping("list")
    public WebAsyncTask<Result<List<Department>>> selectList(DepartmentQuery query) {
        return new WebAsyncTask<>(() -> {
            List<Department> departments = departmentService.selectList(query);
            return R.success(departments);
        });
    }

    @GetMapping("list/{size}")
    public WebAsyncTask<Result<List<Department>>> selectList(DepartmentQuery query, @PathVariable int size) {
        return new WebAsyncTask<>(() -> {
            List<Department> data = departmentService.selectList((DepartmentQuery) query.withSize(size));
            return R.success(data);
        });
    }

    @GetMapping("one")
    public WebAsyncTask<Result<Department>> selectOne(DepartmentQuery query) {
        return new WebAsyncTask<>(() -> R.success(departmentService.selectOne(query)));
    }

    @GetMapping("{id}")
    public WebAsyncTask<Result<DepartmentDetails>> get(@PathVariable Long id) {
        return new WebAsyncTask<Result<DepartmentDetails>>(() -> {
            return R.success(departmentService.get(id));
        });
    }

    @PostMapping
    public WebAsyncTask<Result<?>> save(@RequestBody DepartmentModelVo formVo) {
        return new WebAsyncTask<>(() -> {
            departmentService.save(formVo);
            return R.success();
        });
    }

    @PutMapping
    public WebAsyncTask<Result<?>> update(@RequestBody DepartmentModelVo formVo) {
        return new WebAsyncTask<>(() -> {
            departmentService.update(formVo);
            return R.success();
        });
    }

    @PutMapping("{id}")
    public WebAsyncTask<Result<?>> update(@RequestBody DepartmentModelVo formVo, @PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            departmentService.update((DepartmentModelVo) formVo.withId(id));
            return R.success();
        });
    }

    @DeleteMapping("{id}")
    public WebAsyncTask<Result<?>> delete(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            departmentService.delete(Collections.singletonList(id));
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public WebAsyncTask<Result<?>> delete1(@RequestParam List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            departmentService.delete(ids);
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public WebAsyncTask<Result<?>> delete2(@RequestBody List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            departmentService.delete(ids);
            return R.success();
        });
    }
}