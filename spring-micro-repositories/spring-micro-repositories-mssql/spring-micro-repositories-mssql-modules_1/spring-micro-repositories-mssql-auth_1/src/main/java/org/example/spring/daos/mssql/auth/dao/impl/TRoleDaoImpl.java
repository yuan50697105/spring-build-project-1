package org.example.spring.daos.mssql.auth.dao.impl;

import org.example.spring.daos.mssql.auth.dao.TRoleDao;
import org.example.spring.daos.mssql.auth.mapper.TRoleMapper;
import org.example.spring.daos.mssql.auth.table.po.TRole;
import org.example.spring.daos.mssql.auth.table.query.TRoleQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TRoleDaoImpl extends TkExtDaoImpl<TRole, TRoleQuery, TRoleMapper> implements TRoleDao {
}