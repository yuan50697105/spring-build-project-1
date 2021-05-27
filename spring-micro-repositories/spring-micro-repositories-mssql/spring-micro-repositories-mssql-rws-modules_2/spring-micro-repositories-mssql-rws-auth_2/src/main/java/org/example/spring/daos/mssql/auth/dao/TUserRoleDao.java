package org.example.spring.daos.mssql.auth.dao;

import org.example.spring.daos.mssql.auth.table.po.TUserRole;
import org.example.spring.daos.mssql.auth.table.query.TUserRoleQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TUserRoleDao extends TkExtDao<TUserRole, TUserRoleQuery> {
}
