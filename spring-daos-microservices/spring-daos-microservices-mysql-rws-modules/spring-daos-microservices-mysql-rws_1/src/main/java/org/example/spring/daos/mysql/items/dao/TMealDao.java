package org.example.spring.daos.mysql.items.dao;

import org.example.spring.daos.mysql.items.table.po.TMeal;
import org.example.spring.daos.mysql.items.table.query.TMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TMealDao extends TkBaseDao<TMeal, TMealQuery> {
}
