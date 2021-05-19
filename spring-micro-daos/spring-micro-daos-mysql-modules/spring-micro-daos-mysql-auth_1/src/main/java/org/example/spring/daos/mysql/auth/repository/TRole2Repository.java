package org.example.spring.daos.mysql.auth.repository;

import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.po.TRole;
import org.example.spring.daos.mysql.auth.table.query.TRoleQuery;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TRole2Repository extends IBaseRepository<TRole, TRoleDTO, TRoleVo, TRoleQuery> {
}
