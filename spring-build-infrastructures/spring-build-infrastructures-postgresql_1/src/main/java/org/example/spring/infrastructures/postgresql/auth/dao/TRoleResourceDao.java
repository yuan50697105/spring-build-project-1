package org.example.spring.infrastructures.postgresql.auth.dao;

import org.example.spring.infrastructures.postgresql.auth.table.po.TResource;
import org.example.spring.infrastructures.postgresql.auth.table.po.TRoleResource;
import org.example.spring.infrastructures.postgresql.auth.table.query.TRolePermissionQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TRoleResourceDao extends TkBaseDao<TRoleResource, TRolePermissionQuery> {
    boolean saveNew(Long id, List<Long> permissionIds);

    boolean saveUpdate(Long id, List<Long> permissionIds);

    boolean removeByRoleIds(List<Long> ids);

    boolean removeByRoleId(Long roleId);

    List<TResource> listByRoleId(Long roleId);

    boolean removeByPermissionIds(List<Long> permissionIds);
}
