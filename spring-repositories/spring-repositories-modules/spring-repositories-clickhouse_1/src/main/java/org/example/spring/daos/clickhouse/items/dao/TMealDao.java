package org.example.spring.daos.clickhouse.items.dao;

import org.example.spring.daos.clickhouse.items.table.po.TMeal;
import org.example.spring.daos.clickhouse.items.table.query.TMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TMealDao extends TkBaseDao<TMeal, TMealQuery> {
}
