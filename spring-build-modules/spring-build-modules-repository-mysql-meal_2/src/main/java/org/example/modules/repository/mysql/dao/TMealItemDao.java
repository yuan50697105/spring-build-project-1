package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.table.po.TMealItem;
import org.example.modules.repository.mysql.table.query.TMealItemQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TMealItemDao extends TkBaseDao<TMealItem, TMealItemQuery> {
    List<TMealItem> listByMealId(Long id);
}
