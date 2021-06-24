package org.example.spring.repositories.auth.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.auth.postgres.table.dto.TDepartmentDTO;
import org.example.spring.repositories.auth.postgres.table.dto.TDepartmentRoleDTO;
import org.example.spring.repositories.auth.postgres.table.po.TDepartment;
import org.example.spring.repositories.auth.postgres.table.query.TDepartmentQuery;
import org.example.spring.repositories.auth.postgres.table.vo.TDepartmentVo;

@Deprecated
public interface TDepartmentRepository extends IBaseRepository<TDepartment, TDepartmentDTO, TDepartmentVo, TDepartmentQuery> {
    TDepartmentRoleDTO getDetails(Long id);
}
