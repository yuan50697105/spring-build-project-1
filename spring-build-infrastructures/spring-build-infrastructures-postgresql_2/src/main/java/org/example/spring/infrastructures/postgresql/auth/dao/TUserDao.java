package org.example.spring.infrastructures.postgresql.auth.dao;

import org.example.spring.infrastructures.postgresql.auth.table.po.TUser;
import org.example.spring.infrastructures.postgresql.auth.table.query.TUserQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TUserDao extends TkBaseDao<TUser, TUserQuery> {
    boolean existByUsername(String username);
}
