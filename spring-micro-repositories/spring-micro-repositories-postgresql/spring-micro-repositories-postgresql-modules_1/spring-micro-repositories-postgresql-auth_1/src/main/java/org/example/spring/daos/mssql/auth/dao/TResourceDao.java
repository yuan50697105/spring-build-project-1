package org.example.spring.daos.mssql.auth.dao;

import org.example.spring.daos.mssql.auth.table.po.TResource;
import org.example.spring.daos.mssql.auth.table.query.TResourceQuery;
import org.example.spring.plugins.mybatis.dao.TkExtDao;

public interface TResourceDao extends TkExtDao<TResource, TResourceQuery> {
}
