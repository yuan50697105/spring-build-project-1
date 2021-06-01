package org.example.spring.repositories.oracle.auth.dao;

import org.example.spring.repositories.oracle.auth.table.po.TUser;
import org.example.spring.repositories.oracle.auth.table.query.TUserQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TUserDao extends TkBaseDao<TUser, TUserQuery> {
    boolean existByUsername(String username);

    boolean updateStatusByIds(String status, List<Long> ids);
}
