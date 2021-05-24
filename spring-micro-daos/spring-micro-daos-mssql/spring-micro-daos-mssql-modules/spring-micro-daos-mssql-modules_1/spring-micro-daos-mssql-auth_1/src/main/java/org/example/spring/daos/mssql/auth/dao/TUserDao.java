package org.example.spring.daos.mssql.auth.dao;

import org.example.spring.daos.mssql.auth.table.po.TUser;
import org.example.spring.daos.mssql.auth.table.query.TUserQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TUserDao extends TkExtDao<TUser, TUserQuery> {
}
