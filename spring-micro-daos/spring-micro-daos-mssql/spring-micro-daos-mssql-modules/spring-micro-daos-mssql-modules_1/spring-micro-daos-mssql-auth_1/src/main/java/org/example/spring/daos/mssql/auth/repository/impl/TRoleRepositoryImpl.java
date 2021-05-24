package org.example.spring.daos.mssql.auth.repository.impl;

import org.example.spring.daos.mssql.auth.converter.TRoleConverter;
import org.example.spring.daos.mssql.auth.dao.TRoleDao;
import org.example.spring.daos.mssql.auth.repository.TRoleRepository;
import org.example.spring.daos.mssql.auth.table.dto.TRoleDto;
import org.example.spring.daos.mssql.auth.table.po.TRole;
import org.example.spring.daos.mssql.auth.table.query.TRoleQuery;
import org.example.spring.daos.mssql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TRoleRepositoryImpl extends IBaseRepositoryImpl<TRole, TRoleDto, TRoleVo, TRoleQuery, TRoleConverter, TRoleDao> implements TRoleRepository {
}