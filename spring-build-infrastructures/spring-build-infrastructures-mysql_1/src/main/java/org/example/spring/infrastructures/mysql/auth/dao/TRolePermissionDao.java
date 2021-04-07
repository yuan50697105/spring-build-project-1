package org.example.spring.infrastructures.mysql.auth.dao;

import org.example.spring.infrastructures.mysql.auth.table.po.TRolePermission;
import org.example.spring.infrastructures.mysql.auth.table.query.TRolePermissionQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TRolePermissionDao extends TkBaseDao<TRolePermission, TRolePermissionQuery> {
}
