package org.example.spring.models.clickhouse.auth.repository;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.models.clickhouse.auth.entity.query.DepartmentQuery;
import org.example.spring.models.clickhouse.auth.entity.result.Department;
import org.example.spring.models.clickhouse.auth.entity.result.DepartmentDetails;
import org.example.spring.models.clickhouse.auth.entity.vo.DepartmentModelVo;
import org.example.spring.models.commons.repository.IBaseRepository;

import java.util.List;

public interface DepartmentRepository extends IBaseRepository<Department, DepartmentModelVo, DepartmentDetails, DepartmentQuery> {
    List<Tree<Long>> listTree(DepartmentQuery query);
}