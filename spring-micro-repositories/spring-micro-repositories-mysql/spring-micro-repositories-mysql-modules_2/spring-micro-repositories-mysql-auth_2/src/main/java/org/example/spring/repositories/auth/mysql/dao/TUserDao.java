package org.example.spring.repositories.auth.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.auth.mysql.table.po.TUser;
import org.example.spring.repositories.auth.mysql.table.query.TUserQuery;

import java.util.List;

@SuppressWarnings("UnusedReturnValue")
public interface TUserDao extends TkBaseDao<TUser, TUserQuery> {
    boolean existByUsername(String username);

    boolean updateStatusByIds(String status, List<Long> ids);
}
