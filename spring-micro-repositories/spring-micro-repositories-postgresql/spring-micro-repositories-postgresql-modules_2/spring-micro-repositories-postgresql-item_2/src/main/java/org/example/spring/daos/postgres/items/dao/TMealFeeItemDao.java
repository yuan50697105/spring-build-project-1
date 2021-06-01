package org.example.spring.daos.postgres.items.dao;

import org.example.spring.daos.postgres.items.table.po.TMealFeeItem;
import org.example.spring.daos.postgres.items.table.query.TMealFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TMealFeeItemDao extends TkBaseDao<TMealFeeItem, TMealFeeItemQuery> {
    boolean deleteByMealId(Long id);

    boolean deleteByMealIds(Long... ids);

    boolean deleteByMealIds(List<Long> ids);

    boolean deleteByFeeItemId(Long id);

    boolean deleteByFeeItemIds(Long... ids);

    boolean deleteByFeeItemIds(List<Long> ids);
}
