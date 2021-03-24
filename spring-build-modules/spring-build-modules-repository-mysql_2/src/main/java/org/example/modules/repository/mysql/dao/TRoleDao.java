package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.entity.po.TRole;
import org.example.modules.repository.mysql.entity.query.TRoleQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TRoleDao extends TkBaseDao<TRole, TRoleQuery> {
    List<Long> getRoleIdListByIds(List<Long> roleIds);
}
