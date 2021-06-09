package org.example.spring.domains.services.postgres.auth.service;


import org.example.spring.domains.services.DService;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.entity.auth.po.Department;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;

public interface DDepartmentService extends DService<Department, DepartmentVo, DepartmentDTO, DepartmentQuery> {
    DepartmentRoleDTO getWithRole(Long id);
}
