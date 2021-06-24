package org.example.spring.repositories.auth.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.auth.mssql.table.dto.TRoleDTO;
import org.example.spring.repositories.auth.mssql.table.dto.TRoleResourceDTO;
import org.example.spring.repositories.auth.mssql.table.po.TRole;
import org.example.spring.repositories.auth.mssql.table.query.TRoleQuery;
import org.example.spring.repositories.auth.mssql.table.vo.TRoleVo;

import java.util.List;

@Deprecated
public interface TRoleRepository extends IBaseRepository<TRole, TRoleDTO, TRoleVo, TRoleQuery> {
    List<TRoleDTO> queryListByDepartmentId(Long departmentId);

    TRoleResourceDTO getDetails(Long id);

    List<TRoleDTO> queryListByUserId(Long id);
}
