package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.entity.po.TRolePermission;
import org.example.modules.repository.mysql.entity.query.TRolePermissionQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TRolePermissionDao extends TkBaseDao<TRolePermission, TRolePermissionQuery> {
    List<Long> getRoleIdsByRoleId(Long roleId);

    boolean removeByPermissionIdsAndRoleId(List<Long> permissionIds, Long roleId);

    boolean removeByRoleIds(List<Long> roleIds);
}
