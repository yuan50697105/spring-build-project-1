package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.table.po.TRole;
import org.example.modules.repository.mysql.table.po.TUserRole;
import org.example.modules.repository.mysql.table.query.TUserRoleQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TUserRoleDao extends TkBaseDao<TUserRole, TUserRoleQuery> {
    boolean removeByUserIds(List<Long> userIds);

    boolean removeByRoleIdsAndUserId(List<Long> userRoleIds, Long id);

    List<TRole> getRolesByUserId(Long userId);

    List<Long> getRoleIdsByUserId(Long id);

    List<TRole> getRolesByUsername(String username);
}
