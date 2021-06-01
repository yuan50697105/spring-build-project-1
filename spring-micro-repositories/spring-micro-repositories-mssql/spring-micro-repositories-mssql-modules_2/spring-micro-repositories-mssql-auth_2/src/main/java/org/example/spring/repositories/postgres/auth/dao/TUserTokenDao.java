package org.example.spring.repositories.postgres.auth.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.postgres.auth.table.po.TUserToken;
import org.example.spring.repositories.postgres.auth.table.query.TUserTokenQuery;

public interface TUserTokenDao extends TkExtDao<TUserToken, TUserTokenQuery> {
}
