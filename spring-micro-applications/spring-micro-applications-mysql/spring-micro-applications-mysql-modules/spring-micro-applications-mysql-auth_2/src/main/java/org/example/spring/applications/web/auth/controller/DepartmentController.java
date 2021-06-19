package org.example.spring.applications.web.auth.controller;


import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.services.mysql.auth.service.DDepartmentService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
@RestController
@RequestMapping(value = "department", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@AllArgsConstructor
public class DepartmentController {
    private final DDepartmentService departmentService;

    @GetMapping
    public Result<IPageData<DepartmentDTO>> queryPage(DepartmentQuery query) {
        IPageData<DepartmentDTO> data = departmentService.data(query);
        return R.success(data.getTotalRowNum(), data);
    }

    @GetMapping("list/{size}")
    public Result<List<DepartmentDTO>> queryList(DepartmentQuery query, @PathVariable int size) {
        List<DepartmentDTO> data = departmentService.top((DepartmentQuery) query.withSize(size));
        return R.success((long) data.size(), data);
    }

    @GetMapping("list")
    public Result<List<DepartmentDTO>> queryList(DepartmentQuery query) {
        List<DepartmentDTO> data = departmentService.list(query);
        return R.success((long) data.size(), data);
    }

    @GetMapping("one")
    public Result<DepartmentDTO> queryOne(DepartmentQuery query) {
        DepartmentDTO data = departmentService.one(query);
        return R.success(data);
    }

    @GetMapping("{id}")
    public Result<DepartmentDTO> get(@PathVariable Long id) {
        DepartmentDTO data = departmentService.get(id);
        return R.success(data);
    }

    @GetMapping("{id}/with/role")
    public Result<DepartmentRoleDTO> getWithRole(@PathVariable Long id) {
        return R.success(departmentService.getWithRole(id));
    }

    @PostMapping
    public Result<?> save(@RequestBody DepartmentVo formVo) {
        departmentService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody DepartmentVo formVo) {
        departmentService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@RequestBody DepartmentVo formVo, @PathVariable Long id) {
        formVo.setId(id);
        departmentService.update(formVo);
        return R.success();
    }


    @DeleteMapping("{id}")
    public Result<?> delete(@PathVariable Long id) {
        departmentService.delete(Collections.singletonList(id));
        return R.success();
    }

    @DeleteMapping
    public Result<?> delete(List<Long> ids) {
        departmentService.delete(ids);
        return R.success();
    }

}