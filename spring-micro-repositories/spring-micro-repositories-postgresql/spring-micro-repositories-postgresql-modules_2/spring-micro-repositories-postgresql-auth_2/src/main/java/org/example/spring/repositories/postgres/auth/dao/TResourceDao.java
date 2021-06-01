package org.example.spring.repositories.postgres.auth.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.postgres.auth.table.po.TResource;
import org.example.spring.repositories.postgres.auth.table.query.TResourceQuery;

import java.util.List;

public interface TResourceDao extends TkBaseDao<TResource, TResourceQuery> {

    List<TResource> queryListByRoleId(Long roleId);

    List<TResource> queryListByUserId(Long id);
}
