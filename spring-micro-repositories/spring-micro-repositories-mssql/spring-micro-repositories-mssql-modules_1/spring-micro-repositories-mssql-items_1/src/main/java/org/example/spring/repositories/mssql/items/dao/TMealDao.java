package org.example.spring.repositories.mssql.items.dao;

import org.example.spring.repositories.mssql.items.table.po.TMeal;
import org.example.spring.repositories.mssql.items.table.query.TMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TMealDao extends TkBaseDao<TMeal, TMealQuery> {
}
