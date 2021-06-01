package org.example.spring.repositories.mssql.auth.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.mssql.auth.table.po.TUserToken;
import org.example.spring.repositories.mssql.auth.table.query.TUserTokenQuery;

public interface TUserTokenDao extends TkExtDao<TUserToken, TUserTokenQuery> {
}
