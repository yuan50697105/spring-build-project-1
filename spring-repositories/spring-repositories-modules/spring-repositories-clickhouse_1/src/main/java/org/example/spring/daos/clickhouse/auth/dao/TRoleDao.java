package org.example.spring.daos.clickhouse.auth.dao;

import org.example.spring.daos.clickhouse.auth.table.po.TRole;
import org.example.spring.daos.clickhouse.auth.table.query.TRoleQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TRoleDao extends TkBaseDao<TRole, TRoleQuery> {
    List<Long> listRoleIdsByRoleIdsOrRoleName(List<Long> roleIds, List<String> roleName);

    List<Long> listRoleIdsByRoleIds(List<Long> roleIds);
}
