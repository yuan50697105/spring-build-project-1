package org.example.spring.infrastructures.postgresql.auth.dao;

import org.example.spring.infrastructures.postgresql.auth.table.po.TResource;
import org.example.spring.infrastructures.postgresql.auth.table.query.TResourceQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TResourceDao extends TkBaseDao<TResource, TResourceQuery> {
    List<Long> listResourceIdsByResourceIdsOrPermissionName(List<Long> permissionIds, List<String> permissionName);

    boolean existChidByPids(List<Long> ids);

    List<Long> listResourceIdsByResourceIds(List<Long> resourceIds);
}