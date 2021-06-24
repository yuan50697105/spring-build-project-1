package org.example.spring.repositories.auth.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.auth.mysql.table.dto.TDepartmentDTO;
import org.example.spring.repositories.auth.mysql.table.dto.TDepartmentRoleDTO;
import org.example.spring.repositories.auth.mysql.table.po.TDepartment;
import org.example.spring.repositories.auth.mysql.table.query.TDepartmentQuery;
import org.example.spring.repositories.auth.mysql.table.vo.TDepartmentVo;

@Deprecated
public interface TDepartmentRepository extends IBaseRepository<TDepartment, TDepartmentDTO, TDepartmentVo, TDepartmentQuery> {
    TDepartmentRoleDTO getDetails(Long id);
}
