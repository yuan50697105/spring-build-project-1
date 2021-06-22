package org.example.spring.repositories.aggregation.items.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.aggregation.items.table.po.TMeal;
import org.example.spring.repositories.aggregation.items.table.query.TMealQuery;

public interface TMealDao extends TkBaseDao<TMeal, TMealQuery> {
}
