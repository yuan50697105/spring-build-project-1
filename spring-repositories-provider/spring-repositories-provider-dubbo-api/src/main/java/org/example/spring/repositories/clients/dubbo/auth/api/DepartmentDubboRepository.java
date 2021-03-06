package org.example.spring.repositories.clients.dubbo.auth.api;

import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.entity.auth.po.Department;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;

import java.util.Optional;

public interface DepartmentDubboRepository extends CommonsDubboRepository<Department, DepartmentVo, DepartmentDTO, DepartmentQuery> {
    DepartmentRoleDTO getDepartmentRole(Long id);

    Optional<DepartmentRoleDTO> getDepartmentRoleOpt(Long id);
}
