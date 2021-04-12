package org.example.spring.applications.web.auth;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.auth.service.RoleService;
import org.example.spring.infrastructures.mysql.auth.entity.query.RoleQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Role;
import org.example.spring.infrastructures.mysql.auth.entity.result.RoleDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.RoleFormVo;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
@RestController
@RequestMapping(value = "role",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@AllArgsConstructor
public class RoleController {
    private final RoleService roleService;

    @GetMapping
    public Result<List<Role>> queryPage(RoleQuery query) {
        IPageData<Role> data = roleService.queryPage(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }

    @GetMapping("list")
    public Result<List<Role>> queryList(RoleQuery query) {
        List<Role> data = roleService.queryList(query);
        return R.success((long) data.size(), data);
    }

    @GetMapping("list/{size}")
    public Result<List<Role>> queryTop(RoleQuery query,@PathVariable int size) {
        List<Role> data = roleService.queryList((RoleQuery) query.withSize(size));
        return R.success((long) data.size(), data);
    }

    @GetMapping("one")
    public Result<Role> queryOne(RoleQuery query) {
        Role data = roleService.queryOne(query);
        return R.success(data);
    }

    @GetMapping("{id}")
    public Result<RoleDetails> get(@PathVariable Long id) {
        RoleDetails data = roleService.get(id);
        return R.success(data);
    }

    @PostMapping
    public Result<?> save(@RequestBody RoleFormVo formVo) {
        roleService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody RoleFormVo formVo) {
        roleService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@RequestBody RoleFormVo formVo, @PathVariable Long id) {
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