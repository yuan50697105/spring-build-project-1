package org.example.spring.repositories.mysql.auth.repository;

import org.example.spring.repositories.mysql.auth.table.dto.TDepartmentDTO;
import org.example.spring.repositories.mysql.auth.table.dto.TDepartmentRoleDTO;
import org.example.spring.repositories.mysql.auth.table.po.TDepartment;
import org.example.spring.repositories.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TDepartmentRepository extends IBaseRepository<TDepartment, TDepartmentDTO, TDepartmentVo, TDepartmentQuery> {
    TDepartmentRoleDTO getDetails(Long id);
}
