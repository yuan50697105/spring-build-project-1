package org.example.spring.infrastructures.postgresql.items.dao;

import org.example.spring.infrastructures.postgresql.items.table.po.TMeal;
import org.example.spring.infrastructures.postgresql.items.table.query.TMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TMealDao extends TkBaseDao<TMeal, TMealQuery> {
}
