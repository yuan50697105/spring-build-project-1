package org.example.spring.applications.web.auth.controller;


import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.services.auth.mysql.service.DRoleService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
@RestController
@RequestMapping(value = "role", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@AllArgsConstructor
public class RoleController {
    private final DRoleService roleService;

    @GetMapping
    public Result<IPageData<RoleDTO>> queryPage(RoleQuery query) {
        IPageData<RoleDTO> data = roleService.data(query);
        return R.success(data.getTotalRowNum(), data);
    }

    @GetMapping("list/{size}")
    public Result<List<RoleDTO>> queryList(RoleQuery query, @PathVariable int size) {
        List<RoleDTO> data = roleService.top((RoleQuery) query.withSize(size));
        return R.success((long) data.size(), data);
    }

    @GetMapping("list")
    public Result<List<RoleDTO>> queryList(RoleQuery query) {
        List<RoleDTO> data = roleService.list(query);
        return R.success((long) data.size(), data);
    }

    @GetMapping("one")
    public Result<RoleDTO> queryOne(RoleQuery query) {
        RoleDTO data = roleService.one(query);
        return R.success(data);
    }

    @GetMapping("{id}")
    public Result<RoleDTO> get(@PathVariable Long id) {
        RoleDTO data = roleService.get(id);
        return R.success(data);
    }

    @PostMapping
    public Result<?> save(@RequestBody RoleVo formVo) {
        roleService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody RoleVo formVo) {
        roleService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@RequestBody RoleVo formVo, @PathVariable Long id) {
        formVo.setId(id);
        roleService.update(formVo);
        return R.success();
    }


    @DeleteMapping("{id}")
    public Result<?> delete(@PathVariable Long id) {
        roleService.delete(Collections.singletonList(id));
        return R.success();
    }

    @DeleteMapping
    public Result<?> delete(List<Long> ids) {
        roleService.delete(ids);
        return R.success();
    }

}