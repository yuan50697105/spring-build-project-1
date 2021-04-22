package org.example.spring.applications.web.auth;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import cn.hutool.core.lang.tree.Tree;
import lombok.AllArgsConstructor;
import org.example.spring.domains.auth.service.ResourceService;
import org.example.spring.models.auth.entity.query.ResourceQuery;
import org.example.spring.models.auth.entity.result.ResourceDetails;
import org.example.spring.models.auth.entity.vo.ResourceModelVo;
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
        List<Tree<Long>> data = resourceService.listResourceByUserId(id);
        return R.success(data);
    }

    @GetMapping
    public Result<List<Tree<Long>>> data(ResourceQuery query) {
        return R.success(resourceService.selectTreeList(query));
    }

    @GetMapping("{id}")
    public Result<ResourceDetails> get(@PathVariable Long id) {
        ResourceDetails details = resourceService.get(id);
        return R.success(details);
    }

    @PostMapping
    public Result<?> save(@RequestBody ResourceModelVo formVo) {
        resourceService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody ResourceModelVo formVo) {
        resourceService.update(formVo);
        return R.success();
    }


    @PutMapping("{id}")
    public Result<?> update(@RequestBody ResourceModelVo formVo, @PathVariable Long id) {
        resourceService.update((ResourceModelVo) formVo.withId(id));
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