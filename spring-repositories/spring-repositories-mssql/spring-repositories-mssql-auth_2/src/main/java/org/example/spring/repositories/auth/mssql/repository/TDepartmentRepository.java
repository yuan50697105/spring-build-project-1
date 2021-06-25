package org.example.spring.repositories.auth.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.auth.mssql.table.dto.TDepartmentDTO;
import org.example.spring.repositories.auth.mssql.table.dto.TDepartmentRoleDTO;
import org.example.spring.repositories.auth.mssql.table.po.TDepartment;
import org.example.spring.repositories.auth.mssql.table.query.TDepartmentQuery;
import org.example.spring.repositories.auth.mssql.table.vo.TDepartmentVo;

@Deprecated
public interface TDepartmentRepository extends IBaseRepository<TDepartment, TDepartmentDTO, TDepartmentVo, TDepartmentQuery> {
    TDepartmentRoleDTO getDetails(Long id);
}
