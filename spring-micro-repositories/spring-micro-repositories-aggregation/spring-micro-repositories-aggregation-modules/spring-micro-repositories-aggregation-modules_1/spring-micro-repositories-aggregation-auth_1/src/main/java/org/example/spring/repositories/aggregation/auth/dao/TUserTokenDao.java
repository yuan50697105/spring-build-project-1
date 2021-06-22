package org.example.spring.repositories.aggregation.auth.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.aggregation.auth.table.po.TUserToken;
import org.example.spring.repositories.aggregation.auth.table.query.TUserTokenQuery;

public interface TUserTokenDao extends TkExtDao<TUserToken, TUserTokenQuery> {
}
