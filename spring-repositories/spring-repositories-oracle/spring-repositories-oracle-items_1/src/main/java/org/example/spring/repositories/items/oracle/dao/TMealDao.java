package org.example.spring.repositories.items.oracle.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.items.oracle.table.po.TMeal;
import org.example.spring.repositories.items.oracle.table.query.TMealQuery;

public interface TMealDao extends TkBaseDao<TMeal, TMealQuery> {
}
