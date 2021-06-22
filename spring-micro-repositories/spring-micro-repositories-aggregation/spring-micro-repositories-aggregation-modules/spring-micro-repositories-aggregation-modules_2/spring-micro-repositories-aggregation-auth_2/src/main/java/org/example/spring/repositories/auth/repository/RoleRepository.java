package org.example.spring.repositories.auth.repository;


import org.example.spring.plugins.mybatis.repository.ICommonsRepository;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.RoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Role;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;

import java.util.List;

public interface RoleRepository extends ICommonsRepository<Role, RoleDTO, RoleVo, RoleQuery> {
    List<RoleDTO> queryListByDepartmentId(Long departmentId);

    RoleResourceDTO getDetails(Long id);

    List<RoleDTO> queryListByUserId(Long id);
}
