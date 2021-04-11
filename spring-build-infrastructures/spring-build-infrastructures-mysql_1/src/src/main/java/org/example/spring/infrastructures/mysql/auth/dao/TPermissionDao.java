package org.example.spring.infrastructures.mysql.auth.dao;

import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;
import org.example.spring.infrastructures.mysql.auth.table.query.TPermissionQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TPermissionDao extends TkBaseDao<TPermission, TPermissionQuery> {
    List<Long> listPermissionIdsByPermissionIdsOrPermissionName(List<Long> permissionIds, List<String> permissionName);
}
