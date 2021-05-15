package org.example.spring.daos.mysql.auth.client;

import org.example.spring.daos.mysql.auth.entity.vo.DepartmentVo;
import org.example.spring.daos.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("department")
public interface DepartmentDaoClient {
    @PostMapping
    void save(@RequestBody DepartmentVo departmentVo);

    @PutMapping
    void update(@RequestBody DepartmentVo departmentVo);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    DepartmentVo get(@PathVariable Long id);

    @GetMapping
    IPageData<DepartmentVo> data(@SpringQueryMap DepartmentQuery query);

    @GetMapping("list")
    List<DepartmentVo> list(@SpringQueryMap DepartmentQuery query);

    @GetMapping("one")
    Optional<DepartmentVo> one(@SpringQueryMap DepartmentQuery query);
}
