package org.example.spring.repositories.items.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.items.mysql.table.po.TMeal;
import org.example.spring.repositories.items.mysql.table.query.TMealQuery;

public interface TMealDao extends TkBaseDao<TMeal, TMealQuery> {
}
