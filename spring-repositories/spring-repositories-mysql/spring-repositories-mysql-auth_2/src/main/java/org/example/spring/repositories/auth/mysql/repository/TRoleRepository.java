package org.example.spring.repositories.auth.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.auth.mysql.table.dto.TRoleDTO;
import org.example.spring.repositories.auth.mysql.table.dto.TRoleResourceDTO;
import org.example.spring.repositories.auth.mysql.table.po.TRole;
import org.example.spring.repositories.auth.mysql.table.query.TRoleQuery;
import org.example.spring.repositories.auth.mysql.table.vo.TRoleVo;

import java.util.List;

@Deprecated
public interface TRoleRepository extends IBaseRepository<TRole, TRoleDTO, TRoleVo, TRoleQuery> {
    List<TRoleDTO> queryListByDepartmentId(Long departmentId);

    TRoleResourceDTO getDetails(Long id);

    List<TRoleDTO> queryListByUserId(Long id);
}
