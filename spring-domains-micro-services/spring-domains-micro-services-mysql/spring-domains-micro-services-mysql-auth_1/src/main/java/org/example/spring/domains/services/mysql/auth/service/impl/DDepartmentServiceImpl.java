package org.example.spring.domains.services.mysql.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.services.impl.DServiceImpl;
import org.example.spring.domains.services.mysql.auth.service.DDepartmentService;
import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.commons.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.auth.po.Department;
import org.example.spring.repositories.commons.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.auth.vo.DepartmentVo;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DDepartmentServiceImpl extends DServiceImpl<Department, DepartmentVo, DepartmentDTO, DepartmentQuery, DepartmentRepository> implements DDepartmentService {
    @Override
    public DepartmentRoleDTO getWithRole(Long id) {
        return null;
    }
}