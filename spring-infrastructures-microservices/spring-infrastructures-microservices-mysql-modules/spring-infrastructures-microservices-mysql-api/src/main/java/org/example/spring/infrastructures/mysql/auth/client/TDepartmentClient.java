package org.example.spring.infrastructures.mysql.auth.client;

import org.example.spring.infrastructures.mysql.auth.entity.ITDepartment;
import org.example.spring.infrastructures.mysql.auth.entity.query.ITDepartmentQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("department")
public interface TDepartmentClient {
    @PostMapping
    void save(@RequestBody ITDepartment department);

    @PutMapping
    void update(@RequestBody ITDepartment department);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    ITDepartment get(@PathVariable Long id);

    @GetMapping
    IPageData<ITDepartment> data(@SpringQueryMap ITDepartmentQuery query);

    @GetMapping("list")
    List<ITDepartment> list(@SpringQueryMap ITDepartmentQuery query);

    @GetMapping("one")
    Optional<ITDepartment> one(@SpringQueryMap ITDepartmentQuery query);
}
