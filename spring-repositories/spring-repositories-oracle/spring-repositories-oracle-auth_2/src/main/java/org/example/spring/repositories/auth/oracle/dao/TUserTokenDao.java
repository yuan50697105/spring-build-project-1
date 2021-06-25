package org.example.spring.repositories.auth.oracle.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.auth.oracle.table.po.TUserToken;
import org.example.spring.repositories.auth.oracle.table.query.TUserTokenQuery;

public interface TUserTokenDao extends TkExtDao<TUserToken, TUserTokenQuery> {
}
