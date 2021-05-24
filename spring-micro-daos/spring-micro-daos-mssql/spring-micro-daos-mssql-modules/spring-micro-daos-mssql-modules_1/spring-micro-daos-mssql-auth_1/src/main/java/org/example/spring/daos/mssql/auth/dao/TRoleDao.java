package org.example.spring.daos.mssql.auth.dao;

import org.example.spring.daos.mssql.auth.table.po.TRole;
import org.example.spring.daos.mssql.auth.table.query.TRoleQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TRoleDao extends TkExtDao<TRole, TRoleQuery> {
}
