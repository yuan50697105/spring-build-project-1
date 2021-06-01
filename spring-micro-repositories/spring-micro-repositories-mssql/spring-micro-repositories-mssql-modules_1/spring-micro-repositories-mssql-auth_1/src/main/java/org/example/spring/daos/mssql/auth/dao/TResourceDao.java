package org.example.spring.daos.mssql.auth.dao;

import org.example.spring.daos.mssql.auth.table.po.TResource;
import org.example.spring.daos.mssql.auth.table.query.TResourceQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TResourceDao extends TkBaseDao<TResource, TResourceQuery> {

    List<TResource> queryListByRoleId(Long roleId);

    List<TResource> queryListByUserId(Long id);
}
