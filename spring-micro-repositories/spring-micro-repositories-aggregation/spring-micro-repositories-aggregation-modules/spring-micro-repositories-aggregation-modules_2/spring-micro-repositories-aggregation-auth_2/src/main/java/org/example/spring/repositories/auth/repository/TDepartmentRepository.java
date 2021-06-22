package org.example.spring.repositories.auth.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.auth.table.dto.TDepartmentDTO;
import org.example.spring.repositories.auth.table.dto.TDepartmentRoleDTO;
import org.example.spring.repositories.auth.table.po.TDepartment;
import org.example.spring.repositories.auth.table.query.TDepartmentQuery;
import org.example.spring.repositories.auth.table.vo.TDepartmentVo;

@Deprecated
public interface TDepartmentRepository extends IBaseRepository<TDepartment, TDepartmentDTO, TDepartmentVo, TDepartmentQuery> {
    TDepartmentRoleDTO getDetails(Long id);
}
