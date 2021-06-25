package org.example.spring.repositories.items.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.items.mssql.table.po.TMeal;
import org.example.spring.repositories.items.mssql.table.query.TMealQuery;

public interface TMealDao extends TkBaseDao<TMeal, TMealQuery> {
}
