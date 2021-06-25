package org.example.spring.repositories.auth.postgres.repository;


import org.example.spring.plugins.mybatis.repository.ICommonsRepository;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.entity.auth.po.Department;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;

public interface DepartmentRepository extends ICommonsRepository<Department, DepartmentDTO, DepartmentVo, DepartmentQuery> {
    DepartmentRoleDTO getDetails(Long id);
}
