package org.example.spring.daos.postgres.items.dao;

import org.example.spring.daos.postgres.items.table.po.TMeal;
import org.example.spring.daos.postgres.items.table.query.TMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TMealDao extends TkBaseDao<TMeal, TMealQuery> {
}
