package org.example.spring.daos.mssql.auth.dao.impl;

import org.example.spring.daos.mssql.auth.dao.TResourceDao;
import org.example.spring.daos.mssql.auth.mapper.TResourceMapper;
import org.example.spring.daos.mssql.auth.table.po.TResource;
import org.example.spring.daos.mssql.auth.table.query.TResourceQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkExtDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TResourceDaoImpl extends TkExtDaoImpl<TResource, TResourceQuery, TResourceMapper> implements TResourceDao {
}