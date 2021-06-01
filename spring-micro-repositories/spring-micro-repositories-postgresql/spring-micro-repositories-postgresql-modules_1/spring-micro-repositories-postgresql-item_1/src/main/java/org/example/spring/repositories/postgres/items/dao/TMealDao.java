package org.example.spring.repositories.postgres.items.dao;

import org.example.spring.repositories.postgres.items.table.po.TMeal;
import org.example.spring.repositories.postgres.items.table.query.TMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TMealDao extends TkBaseDao<TMeal, TMealQuery> {
}
