package org.example.spring.daos.mysql.auth.dao;

import org.example.spring.daos.mysql.auth.table.po.TUserToken;
import org.example.spring.daos.mysql.auth.table.query.TUserTokenQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TUserTokenDao extends TkExtDao<TUserToken, TUserTokenQuery> {
}
