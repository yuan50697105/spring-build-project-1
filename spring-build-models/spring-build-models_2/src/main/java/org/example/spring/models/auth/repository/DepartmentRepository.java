package org.example.spring.models.auth.repository;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.models.auth.entity.query.DepartmentQuery;
import org.example.spring.models.auth.entity.result.Department;
import org.example.spring.models.auth.entity.result.DepartmentDetails;
import org.example.spring.models.auth.entity.vo.DepartmentFormVo;
import org.example.spring.plugins.commons.repository.IBaseRepository;

import java.util.List;

public interface DepartmentRepository extends IBaseRepository<Department, DepartmentFormVo, DepartmentDetails, DepartmentQuery> {
    List<Tree<Long>> listTree(DepartmentQuery query);
}
