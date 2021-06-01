package org.example.spring.repositories.oracle.auth.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.oracle.auth.table.po.TUserToken;
import org.example.spring.repositories.oracle.auth.table.query.TUserTokenQuery;

public interface TUserTokenDao extends TkExtDao<TUserToken, TUserTokenQuery> {
}
