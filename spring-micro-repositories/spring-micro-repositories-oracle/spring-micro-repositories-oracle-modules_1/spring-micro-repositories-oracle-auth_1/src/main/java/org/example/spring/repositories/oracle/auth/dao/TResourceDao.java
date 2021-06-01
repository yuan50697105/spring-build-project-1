package org.example.spring.repositories.oracle.auth.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.oracle.auth.table.po.TResource;
import org.example.spring.repositories.oracle.auth.table.query.TResourceQuery;

import java.util.List;

public interface TResourceDao extends TkBaseDao<TResource, TResourceQuery> {

    List<TResource> queryListByRoleId(Long roleId);

    List<TResource> queryListByUserId(Long id);
}
