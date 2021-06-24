package org.example.spring.repositories.auth.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.auth.postgres.table.po.TUserToken;
import org.example.spring.repositories.auth.postgres.table.query.TUserTokenQuery;

public interface TUserTokenDao extends TkExtDao<TUserToken, TUserTokenQuery> {
}
