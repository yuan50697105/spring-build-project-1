package org.example.applications.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.domains.service.RoleService;
import org.example.modules.repository.mysql.entity.query.RoleQuery;
import org.example.modules.repository.mysql.entity.result.Role;
import org.example.modules.repository.mysql.entity.result.RoleDetails;
import org.example.modules.repository.mysql.entity.vo.RoleFormVo;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
@AllArgsConstructor
public class RoleController {
    private final RoleService roleService;

    @PostMapping
    public Result<?> save(@Validated @RequestBody RoleFormVo formVo) {
        roleService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@Validated @RequestBody RoleFormVo formVo) {
        roleService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@PathVariable Long id,@Validated @RequestBody RoleFormVo formVo) {
        formVo.setId(id);
        roleService.update(formVo);
        return R.success();
    }

    @GetMapping("{id}")
    public Result<RoleDetails> get(@PathVariable Long id) {
        RoleDetails details = roleService.get(id);
        return R.success(details);
    }

    @GetMapping({"query/one","one"})
    public Result<Role> queryOne(RoleQuery query) {
        return R.success(roleService.queryOne(query));
    }

    @GetMapping({"query/list","list"})
    public Result<List<Role>> queryList(RoleQuery query) {
        List<Role> list = roleService.queryList(query);
        return R.success(list);
    }

    @GetMapping({"","query"})
    public Result<List<Role>> queryPage(RoleQuery query) {
        IPageData<Role> data = roleService.queryPage(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }
}