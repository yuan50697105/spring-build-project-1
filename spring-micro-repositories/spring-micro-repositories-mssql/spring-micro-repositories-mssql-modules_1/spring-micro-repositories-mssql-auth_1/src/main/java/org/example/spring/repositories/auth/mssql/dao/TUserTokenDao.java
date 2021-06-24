package org.example.spring.repositories.auth.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.auth.mssql.table.po.TUserToken;
import org.example.spring.repositories.auth.mssql.table.query.TUserTokenQuery;

public interface TUserTokenDao extends TkExtDao<TUserToken, TUserTokenQuery> {
}
