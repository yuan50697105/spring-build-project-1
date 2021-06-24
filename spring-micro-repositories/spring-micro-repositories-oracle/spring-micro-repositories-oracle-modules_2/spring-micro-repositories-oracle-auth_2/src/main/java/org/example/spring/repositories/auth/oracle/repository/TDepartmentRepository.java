package org.example.spring.repositories.auth.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.auth.oracle.table.dto.TDepartmentDTO;
import org.example.spring.repositories.auth.oracle.table.dto.TDepartmentRoleDTO;
import org.example.spring.repositories.auth.oracle.table.po.TDepartment;
import org.example.spring.repositories.auth.oracle.table.query.TDepartmentQuery;
import org.example.spring.repositories.auth.oracle.table.vo.TDepartmentVo;

@Deprecated
public interface TDepartmentRepository extends IBaseRepository<TDepartment, TDepartmentDTO, TDepartmentVo, TDepartmentQuery> {
    TDepartmentRoleDTO getDetails(Long id);
}
