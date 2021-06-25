package org.example.spring.repositories.clients.auth.api;


import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.entity.auth.po.Department;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;

import java.util.Optional;

public interface DepartmentRepository extends CommonsRepository<Department, DepartmentVo, DepartmentDTO, DepartmentQuery> {
    DepartmentRoleDTO getDepartmentRole(Long id);

    Optional<DepartmentRoleDTO> getDepartmentRoleOpt(Long id);
}
