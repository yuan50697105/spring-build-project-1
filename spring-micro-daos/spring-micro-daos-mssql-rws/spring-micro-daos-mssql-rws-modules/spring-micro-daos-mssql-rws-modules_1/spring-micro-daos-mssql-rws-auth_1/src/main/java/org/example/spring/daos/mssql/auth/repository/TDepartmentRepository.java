package org.example.spring.daos.mssql.auth.repository;

import org.example.spring.daos.mssql.auth.table.dto.TDepartmentDto;
import org.example.spring.daos.mssql.auth.table.po.TDepartment;
import org.example.spring.daos.mssql.auth.table.query.TDepartmentQuery;
import org.example.spring.daos.mssql.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TDepartmentRepository extends IBaseRepository<TDepartment, TDepartmentDto, TDepartmentVo, TDepartmentQuery> {
}
