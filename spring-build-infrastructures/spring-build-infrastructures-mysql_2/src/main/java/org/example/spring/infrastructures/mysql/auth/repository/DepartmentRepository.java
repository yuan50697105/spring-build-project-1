package org.example.spring.infrastructures.mysql.auth.repository;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.infrastructures.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Department;
import org.example.spring.infrastructures.mysql.auth.entity.result.DepartmentDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.DepartmentFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

import java.util.List;

public interface DepartmentRepository extends IBaseRepository<Department, DepartmentFormVo, DepartmentDetails, DepartmentQuery> {
    List<Tree<Long>> listTree(DepartmentQuery query);
}
