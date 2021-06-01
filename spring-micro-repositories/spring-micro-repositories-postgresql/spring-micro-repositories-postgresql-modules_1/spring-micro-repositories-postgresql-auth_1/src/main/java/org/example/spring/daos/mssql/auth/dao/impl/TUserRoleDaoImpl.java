package org.example.spring.daos.mssql.auth.dao.impl;

import org.example.spring.daos.mssql.auth.dao.TUserRoleDao;
import org.example.spring.daos.mssql.auth.mapper.TUserRoleMapper;
import org.example.spring.daos.mssql.auth.table.po.TUserRole;
import org.example.spring.daos.mssql.auth.table.query.TUserRoleQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TUserRoleDaoImpl extends TkExtDaoImpl<TUserRole, TUserRoleQuery, TUserRoleMapper> implements TUserRoleDao {
}