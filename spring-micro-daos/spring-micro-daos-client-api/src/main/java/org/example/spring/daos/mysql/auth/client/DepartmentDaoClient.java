package org.example.spring.daos.mysql.auth.client;

import org.example.spring.daos.mysql.auth.entity.dto.DepartmentDTO;
import org.example.spring.daos.mysql.auth.entity.vo.DepartmentVo;
import org.example.spring.daos.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("department/dao")
public interface DepartmentDaoClient {
    @PostMapping
    void save(@RequestBody DepartmentVo departmentVo);

    @PutMapping
    void update(@RequestBody DepartmentVo departmentVo);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    DepartmentDTO get(@PathVariable Long id);

    @GetMapping
    IPageData<DepartmentDTO> data(@SpringQueryMap DepartmentQuery query);

    @GetMapping("list")
    List<DepartmentDTO> list(@SpringQueryMap DepartmentQuery query);

    @GetMapping("one")
    Optional<DepartmentDTO> one(@SpringQueryMap DepartmentQuery query);
}
