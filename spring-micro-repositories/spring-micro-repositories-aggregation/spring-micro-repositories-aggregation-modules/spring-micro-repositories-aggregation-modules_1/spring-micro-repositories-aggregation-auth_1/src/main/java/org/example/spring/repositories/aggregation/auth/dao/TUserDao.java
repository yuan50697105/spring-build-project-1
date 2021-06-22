package org.example.spring.repositories.aggregation.auth.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.aggregation.auth.table.po.TUser;
import org.example.spring.repositories.aggregation.auth.table.query.TUserQuery;

import java.util.List;

@SuppressWarnings("UnusedReturnValue")
public interface TUserDao extends TkBaseDao<TUser, TUserQuery> {
    boolean existByUsername(String username);

    boolean updateStatusByIds(String status, List<Long> ids);
}
