package org.example.spring.infrastructures.mysql.auth.dao;

import org.example.spring.infrastructures.mysql.auth.table.po.TResource;
import org.example.spring.infrastructures.mysql.auth.table.query.TResourceQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TResourceDao extends TkBaseDao<TResource, TResourceQuery> {
    List<Long> listPermissionIdsByPermissionIdsOrPermissionName(List<Long> permissionIds, List<String> permissionName);
}
