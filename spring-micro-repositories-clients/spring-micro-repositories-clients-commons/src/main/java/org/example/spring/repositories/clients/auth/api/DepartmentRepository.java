package org.example.spring.repositories.clients.auth.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.auth.po.Department;
import org.example.spring.repositories.commons.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.auth.vo.DepartmentVo;

public interface DepartmentRepository extends CommonsRepository<Department, DepartmentVo, DepartmentDTO, DepartmentQuery> {
}
