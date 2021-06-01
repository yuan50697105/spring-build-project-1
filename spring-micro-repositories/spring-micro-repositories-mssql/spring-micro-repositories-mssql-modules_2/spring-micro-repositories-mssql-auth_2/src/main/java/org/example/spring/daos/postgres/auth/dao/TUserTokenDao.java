package org.example.spring.daos.postgres.auth.dao;

import org.example.spring.daos.postgres.auth.table.po.TUserToken;
import org.example.spring.daos.postgres.auth.table.query.TUserTokenQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TUserTokenDao extends TkExtDao<TUserToken, TUserTokenQuery> {
}
