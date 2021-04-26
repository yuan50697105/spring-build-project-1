package org.example.spring.infrastructures.mysql.items.dao;

import org.example.spring.infrastructures.mysql.items.table.po.TMealFeeItem;
import org.example.spring.infrastructures.mysql.items.table.query.TMealFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TMealFeeItemDao extends TkBaseDao<TMealFeeItem, TMealFeeItemQuery> {
}
