package org.example.spring.applications.web.auth;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.auth.service.DepartmentService;
import org.example.spring.models.auth.entity.query.DepartmentQuery;
import org.example.spring.models.auth.entity.result.Department;
import org.example.spring.models.auth.entity.result.DepartmentDetails;
import org.example.spring.models.auth.entity.vo.DepartmentModelVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("department")
@AllArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping
    public Result<List<Department>> selectPage(DepartmentQuery query) {
        IPageData<Department> data = departmentService.selectPage(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }

    @GetMapping("list")
    public Result<List<Department>> selectList(DepartmentQuery query) {
        List<Department> departments = departmentService.selectList(query);
        return R.success(departments);
    }

    @GetMapping("list/{size}")
    public Result<List<Department>> selectList(DepartmentQuery query, @PathVariable int size) {
        return R.success(departmentService.selectList((DepartmentQuery) query.withSize(size)));
    }

    @GetMapping("one")
    public Result<Department> selectOne(DepartmentQuery query) {
        return R.success(departmentService.selectOne(query));
    }

    @GetMapping("{id}")
    public Result<DepartmentDetails> get(@PathVariable Long id) {
        return R.success(departmentService.get(id));
    }

    @PostMapping
    public Result<?> save(@RequestBody DepartmentModelVo formVo) {
        departmentService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody DepartmentModelVo formVo) {
        departmentService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@RequestBody DepartmentModelVo formVo, @PathVariable Long id) {
        departmentService.update((DepartmentModelVo) formVo.withId(id));
        return R.success();
    }

    @DeleteMapping("{id}")
    public Result<?> delete(@PathVariable Long id) {
        departmentService.delete(Collections.singletonList(id));
        return R.success();
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Result<?> delete1(@RequestParam List<Long> ids) {
        departmentService.delete(ids);
        return R.success();
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<?> delete2(@RequestBody List<Long> ids) {
        departmentService.delete(ids);
        return R.success();
    }
}