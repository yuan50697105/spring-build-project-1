package org.example.spring.repositories.aggregation.items.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.aggregation.items.table.po.TCheckItem;
import org.example.spring.repositories.aggregation.items.table.query.TCheckItemQuery;

import java.util.List;

@SuppressWarnings("UnusedReturnValue")
public interface TCheckItemDao extends TkBaseDao<TCheckItem, TCheckItemQuery> {
    boolean deleteByFeeItemIds(List<Long> ids);

    boolean deleteByFeeItemIds(Long... ids);

    boolean deleteByFeeItemId(Long id);
}
