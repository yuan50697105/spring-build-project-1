package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.table.po.TPermission;
import org.example.modules.repository.mysql.table.po.TRolePermission;
import org.example.modules.repository.mysql.table.query.TRolePermissionQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TRolePermissionDao extends TkBaseDao<TRolePermission, TRolePermissionQuery> {
    List<Long> getRoleIdsByRoleId(Long roleId);

    boolean removeByPermissionIdsAndRoleId(List<Long> permissionIds, Long roleId);

    boolean removeByRoleIds(List<Long> roleIds);

    List<TPermission> getRolePermissionsByRoleId(Long id);

    List<TPermission> getRolePermissionsByRoleIds(List<Long> roleIds);
}
