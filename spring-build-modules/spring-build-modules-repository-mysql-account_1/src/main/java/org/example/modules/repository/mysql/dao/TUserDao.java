package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.entity.TUser;
import org.example.modules.repository.mysql.entity.query.TUserQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

public interface TUserDao extends TkBaseDao<TUser, TUserQuery> {
}
