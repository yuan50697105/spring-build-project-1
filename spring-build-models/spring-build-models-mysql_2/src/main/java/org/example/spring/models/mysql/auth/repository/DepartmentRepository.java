package org.example.spring.models.mysql.auth.repository;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.models.commons.repository.IBaseRepository;
import org.example.spring.models.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.models.mysql.auth.entity.result.Department;
import org.example.spring.models.mysql.auth.entity.result.DepartmentDetails;
import org.example.spring.models.mysql.auth.entity.vo.DepartmentModelVo;

import java.util.List;

public interface DepartmentRepository extends IBaseRepository<Department, DepartmentModelVo, DepartmentDetails, DepartmentQuery> {
    List<Tree<Long>> listTree(DepartmentQuery query);
}
