package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.entity.po.TPermission;
import org.example.modules.repository.mysql.entity.query.TPermissionQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TPermissionDao extends TkBaseDao<TPermission, TPermissionQuery> {
    List<Long> getPermisionIdsByPermissionIdsOrPermissionNames(List<Long> permissionIds, List<String> permissionNames);
}
