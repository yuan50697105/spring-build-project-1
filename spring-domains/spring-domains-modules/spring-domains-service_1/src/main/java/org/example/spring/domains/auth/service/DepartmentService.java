package org.example.spring.domains.auth.service;

import org.example.spring.models.auth.entity.query.DepartmentQuery;
import org.example.spring.models.auth.entity.result.Department;
import org.example.spring.models.auth.entity.result.DepartmentDetails;
import org.example.spring.models.auth.entity.vo.DepartmentModelVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DepartmentService {
    void save(DepartmentModelVo formVo);

    void update(DepartmentModelVo formVo);

    void delete(List<Long> ids);

    IPageData<Department> selectPage(DepartmentQuery query);

    List<Department> selectList(DepartmentQuery query);

    Department selectOne(DepartmentQuery query);

    DepartmentDetails get(Long id);
}
