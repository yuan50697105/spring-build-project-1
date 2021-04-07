package org.example.spring.infrastructures.mysql.auth.dao;

import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;
import org.example.spring.infrastructures.mysql.auth.table.po.TRolePermission;
import org.example.spring.infrastructures.mysql.auth.table.query.TRolePermissionQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TRolePermissionDao extends TkBaseDao<TRolePermission, TRolePermissionQuery> {
    boolean saveNew(Long id, List<Long> permissionIds);

    boolean saveUpdate(Long id, List<Long> permissionIds);

    boolean removeByRoleIds(List<Long> ids);

    void removeByRoleId(Long roleId);

    List<TPermission> listByRoleId(Long roleId);
}
