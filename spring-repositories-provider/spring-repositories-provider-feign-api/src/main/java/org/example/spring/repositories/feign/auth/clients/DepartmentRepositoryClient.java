package org.example.spring.repositories.feign.auth.clients;


import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.entity.auth.po.Department;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@RequestMapping("department/repository/client")
public interface DepartmentRepositoryClient extends CommonsFeignClient<Department, DepartmentVo, DepartmentDTO, DepartmentQuery> {

    @GetMapping("get/department/role/{id}")
    DepartmentRoleDTO getDepartmentRole(@PathVariable Long id);

    @GetMapping("get/department/role/opt/{id}")
    Optional<DepartmentRoleDTO> getDepartmentRoleOpt(@PathVariable Long id);
}
