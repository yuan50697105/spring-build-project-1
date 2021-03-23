package org.example.modules.repository.mysql.account.dao;

import org.example.modules.repository.mysql.account.entity.TRole;
import org.example.modules.repository.mysql.account.entity.query.TRoleQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TRoleDao extends TkBaseDao<TRole, TRoleQuery> {
    List<Long> getRoleIdListByIds(List<Long> roleIds);
}
