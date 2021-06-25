package org.example.spring.repositories.items.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.items.postgres.table.po.TMeal;
import org.example.spring.repositories.items.postgres.table.query.TMealQuery;

public interface TMealDao extends TkBaseDao<TMeal, TMealQuery> {
}
