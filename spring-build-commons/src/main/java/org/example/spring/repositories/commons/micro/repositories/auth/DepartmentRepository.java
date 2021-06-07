package org.example.spring.repositories.commons.micro.repositories.auth;

import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.entity.auth.po.Department;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.example.spring.repositories.commons.micro.repositories.commons.CommonsRepository;

public interface DepartmentRepository extends CommonsRepository<Department, DepartmentVo, DepartmentDTO, DepartmentQuery> {
    DepartmentRoleDTO getWithRole(Long id);
}
