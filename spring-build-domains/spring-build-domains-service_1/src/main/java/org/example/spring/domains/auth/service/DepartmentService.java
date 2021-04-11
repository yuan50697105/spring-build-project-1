package org.example.spring.domains.auth.service;

import org.example.spring.infrastructures.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Department;
import org.example.spring.infrastructures.mysql.auth.entity.vo.DepartmentFormVo;
import org.example.spring.plugins.mybatis.entity.IPageData;

import java.util.List;

public interface DepartmentService {
    void save(DepartmentFormVo formVo);

    void update(DepartmentFormVo formVo);

    void delete(List<Long> ids);

    IPageData<Department> selectPage(DepartmentQuery query);

    List<Department> selectList(DepartmentQuery query);

    Department selectOne(DepartmentQuery query);
}
