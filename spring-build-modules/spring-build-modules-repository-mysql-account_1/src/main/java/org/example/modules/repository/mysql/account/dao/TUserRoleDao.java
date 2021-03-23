package org.example.modules.repository.mysql.account.dao;

import org.example.modules.repository.mysql.account.entity.TUserRole;
import org.example.modules.repository.mysql.account.entity.query.TUserRoleQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

public interface TUserRoleDao extends TkBaseDao<TUserRole, TUserRoleQuery> {
}
