package org.example.spring.repositories.auth.oracle.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.auth.oracle.table.po.TResource;
import org.example.spring.repositories.auth.oracle.table.po.TRoleResource;
import org.example.spring.repositories.auth.oracle.table.query.TRolePermissionQuery;

import java.util.List;

public interface TRoleResourceDao extends TkBaseDao<TRoleResource, TRolePermissionQuery> {

    boolean removeByRoleIds(List<Long> ids);

    boolean deleteByRoleIds(List<Long> ids);

    boolean removeByRoleId(Long roleId);

    boolean deleteByRoleId(Long roleId);

    List<TResource> listByRoleId(Long roleId);

    boolean removeByResourceIds(List<Long> resourceIds);

    boolean deleteByResourceIds(List<Long> resourceIds);
}
