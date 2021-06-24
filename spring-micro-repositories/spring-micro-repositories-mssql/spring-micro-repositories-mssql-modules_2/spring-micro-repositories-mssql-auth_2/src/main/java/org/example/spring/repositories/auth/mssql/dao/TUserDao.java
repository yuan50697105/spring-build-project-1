package org.example.spring.repositories.auth.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.auth.mssql.table.po.TUser;
import org.example.spring.repositories.auth.mssql.table.query.TUserQuery;

import java.util.List;

@SuppressWarnings("UnusedReturnValue")
public interface TUserDao extends TkBaseDao<TUser, TUserQuery> {
    boolean existByUsername(String username);

    boolean updateStatusByIds(String status, List<Long> ids);
}
