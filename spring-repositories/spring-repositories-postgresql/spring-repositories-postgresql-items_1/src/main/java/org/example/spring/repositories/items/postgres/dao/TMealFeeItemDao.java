package org.example.spring.repositories.items.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.items.postgres.table.po.TMealFeeItem;
import org.example.spring.repositories.items.postgres.table.query.TMealFeeItemQuery;

import java.util.List;

@SuppressWarnings("UnusedReturnValue")
public interface TMealFeeItemDao extends TkBaseDao<TMealFeeItem, TMealFeeItemQuery> {
    boolean deleteByMealId(Long id);

    boolean deleteByMealIds(Long... ids);

    boolean deleteByMealIds(List<Long> ids);

    boolean deleteByFeeItemId(Long id);

    boolean deleteByFeeItemIds(Long... ids);

    boolean deleteByFeeItemIds(List<Long> ids);
}
