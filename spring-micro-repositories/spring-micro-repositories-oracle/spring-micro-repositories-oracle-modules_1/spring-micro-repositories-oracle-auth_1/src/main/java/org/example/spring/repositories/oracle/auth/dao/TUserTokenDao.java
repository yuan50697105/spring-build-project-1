package org.example.spring.repositories.oracle.auth.dao;

import org.example.spring.repositories.oracle.auth.table.po.TUserToken;
import org.example.spring.repositories.oracle.auth.table.query.TUserTokenQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TUserTokenDao extends TkExtDao<TUserToken, TUserTokenQuery> {
}
