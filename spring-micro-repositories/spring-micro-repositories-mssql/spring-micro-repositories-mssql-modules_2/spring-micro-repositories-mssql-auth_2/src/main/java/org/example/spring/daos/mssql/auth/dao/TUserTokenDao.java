package org.example.spring.daos.mssql.auth.dao;

import org.example.spring.daos.mssql.auth.table.po.TUserToken;
import org.example.spring.daos.mssql.auth.table.query.TUserTokenQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TUserTokenDao extends TkExtDao<TUserToken, TUserTokenQuery> {
}
