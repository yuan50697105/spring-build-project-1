package org.example.spring.infrastructures.mysql.auth.client;

import org.example.spring.infrastructures.mysql.auth.entity.Department;
import org.example.spring.infrastructures.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("department")
public interface DepartmentDaoClient {
    @PostMapping
    void save(@RequestBody Department department);

    @PutMapping
    void update(@RequestBody Department department);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    Department get(@PathVariable Long id);

    @GetMapping
    IPageData<Department> data(@SpringQueryMap DepartmentQuery query);

    @GetMapping("list")
    List<Department> list(@SpringQueryMap DepartmentQuery query);

    @GetMapping("one")
    Optional<Department> one(@SpringQueryMap DepartmentQuery query);
}
