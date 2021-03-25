package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.entity.po.TRole;
import org.example.modules.repository.mysql.entity.query.TRoleQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

import java.util.Collection;
import java.util.List;

public interface TRoleDao extends TkBaseDao<TRole, TRoleQuery> {

    boolean existByRoleName(String roleName);

    List<Long> getRoleIdListByIdsOrNames(List<Long> roleIds, List<String> roleNames);
}
