package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.table.po.TRole;
import org.example.modules.repository.mysql.table.query.TRoleQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TRoleDao extends TkBaseDao<TRole, TRoleQuery> {

    boolean existByRoleName(String roleName);

    List<Long> getRoleIdListByIdsOrNames(List<Long> roleIds, List<String> roleNames);
}
