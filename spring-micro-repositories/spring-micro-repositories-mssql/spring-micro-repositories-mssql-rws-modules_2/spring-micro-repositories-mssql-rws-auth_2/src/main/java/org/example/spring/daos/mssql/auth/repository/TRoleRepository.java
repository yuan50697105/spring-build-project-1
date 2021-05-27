package org.example.spring.daos.mssql.auth.repository;

import org.example.spring.daos.mssql.auth.table.dto.TResourceDto;
import org.example.spring.daos.mssql.auth.table.dto.TRoleDto;
import org.example.spring.daos.mssql.auth.table.po.TResource;
import org.example.spring.daos.mssql.auth.table.po.TRole;
import org.example.spring.daos.mssql.auth.table.query.TResourceQuery;
import org.example.spring.daos.mssql.auth.table.query.TRoleQuery;
import org.example.spring.daos.mssql.auth.table.vo.TResourceVo;
import org.example.spring.daos.mssql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TRoleRepository extends IBaseRepository<TRole, TRoleDto, TRoleVo, TRoleQuery> {
}
