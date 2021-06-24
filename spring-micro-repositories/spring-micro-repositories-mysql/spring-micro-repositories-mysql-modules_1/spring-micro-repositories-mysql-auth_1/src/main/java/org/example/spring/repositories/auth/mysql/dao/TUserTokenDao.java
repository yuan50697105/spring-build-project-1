package org.example.spring.repositories.auth.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.repositories.auth.mysql.table.po.TUserToken;
import org.example.spring.repositories.auth.mysql.table.query.TUserTokenQuery;

public interface TUserTokenDao extends TkExtDao<TUserToken, TUserTokenQuery> {
}
