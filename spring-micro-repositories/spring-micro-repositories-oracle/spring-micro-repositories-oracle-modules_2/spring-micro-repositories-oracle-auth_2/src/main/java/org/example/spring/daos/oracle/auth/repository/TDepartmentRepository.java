package org.example.spring.daos.oracle.auth.repository;

import org.example.spring.daos.oracle.auth.table.dto.TDepartmentDTO;
import org.example.spring.daos.oracle.auth.table.dto.TDepartmentRoleDTO;
import org.example.spring.daos.oracle.auth.table.po.TDepartment;
import org.example.spring.daos.oracle.auth.table.query.TDepartmentQuery;
import org.example.spring.daos.oracle.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TDepartmentRepository extends IBaseRepository<TDepartment, TDepartmentDTO, TDepartmentVo, TDepartmentQuery> {
    TDepartmentRoleDTO getDetails(Long id);
}
