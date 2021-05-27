package org.example.spring.daos.postgresql.auth.dao;

import org.example.spring.daos.postgresql.auth.table.po.TUser;
import org.example.spring.daos.postgresql.auth.table.query.TUserQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TUserDao extends TkBaseDao<TUser, TUserQuery> {
    boolean existByUsername(String username);

    boolean updateStatusByIds(String stats, List<Long> ids);
}
