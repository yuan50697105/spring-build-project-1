package org.example.spring.repositories.mysql.auth.repository;

import org.example.spring.repositories.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.repositories.mysql.auth.table.dto.TRoleResourceDTO;
import org.example.spring.repositories.mysql.auth.table.po.TRole;
import org.example.spring.repositories.mysql.auth.table.query.TRoleQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

import java.util.List;

public interface TRoleRepository extends IBaseRepository<TRole, TRoleDTO, TRoleVo, TRoleQuery> {
    List<TRoleDTO> queryListByDepartmentId(Long departmentId);

    TRoleResourceDTO getDetails(Long id);

    List<TRoleDTO> queryListByUserId(Long id);
}
