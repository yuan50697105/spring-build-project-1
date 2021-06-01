package org.example.spring.repositories.clickhouse.items.dao;

import org.example.spring.repositories.clickhouse.items.table.po.TMealFeeItem;
import org.example.spring.repositories.clickhouse.items.table.query.TMealFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TMealFeeItemDao extends TkBaseDao<TMealFeeItem, TMealFeeItemQuery> {
}
