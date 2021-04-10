package org.example.spring.applications.web.auth;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import cn.hutool.core.lang.tree.Tree;
import lombok.AllArgsConstructor;
import org.example.spring.domains.service.ResourceService;
import org.example.spring.infrastructures.mysql.auth.entity.query.PermissionQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Permission;
import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionFormVo;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("resource")
@AllArgsConstructor
public class ResourceController {
    private final ResourceService resourceService;

    @GetMapping("list/{id}")
    public Result<List<Tree<Long>>> listByUserId(@PathVariable Long id) {
        return R.success(resourceService.listResourceByUserId(id));
    }

    @GetMapping
    public Result<List<Tree<Long>>> data(PermissionQuery query) {
        return R.success(resourceService.selectTreeList(query));
    }

    @GetMapping("{id}")
    public Result<Permission> get(@PathVariable Long id) {
        return R.success(resourceService.get(id));
    }

    @PostMapping
    public Result<?> save(@RequestBody PermissionFormVo formVo) {
        resourceService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody PermissionFormVo formVo) {
        resourceService.update(formVo);
        return R.success();
    }


    @PutMapping("{id}")
    public Result<?> update(@PathVariable Long id,@RequestBody PermissionFormVo formVo) {
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