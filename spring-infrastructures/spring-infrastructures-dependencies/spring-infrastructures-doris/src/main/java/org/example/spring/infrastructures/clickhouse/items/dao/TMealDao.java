package org.example.spring.infrastructures.clickhouse.items.dao;

import org.example.spring.infrastructures.clickhouse.items.table.po.TMeal;
import org.example.spring.infrastructures.clickhouse.items.table.query.TMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TMealDao extends TkBaseDao<TMeal, TMealQuery> {
}
