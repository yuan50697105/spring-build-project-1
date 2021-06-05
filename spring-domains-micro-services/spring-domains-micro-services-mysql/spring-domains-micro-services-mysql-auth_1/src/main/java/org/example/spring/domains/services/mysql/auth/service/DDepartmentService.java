package org.example.spring.domains.services.mysql.auth.service;

import org.example.spring.domains.services.DService;
import org.example.spring.repositories.commons.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.auth.po.Department;
import org.example.spring.repositories.commons.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.auth.vo.DepartmentVo;

public interface DDepartmentService extends DService<Department, DepartmentVo, DepartmentDTO, DepartmentQuery> {
    DepartmentRoleDTO getWithRole(Long id);
}
