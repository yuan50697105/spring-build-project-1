package org.example.modules.repository.mysql.account.dao;

import org.example.modules.repository.mysql.account.entity.TUser;
import org.example.modules.repository.mysql.account.entity.query.TUserQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

public interface TUserDao extends TkBaseDao<TUser, TUserQuery> {
}
