package org.example.spring.daos.postgres.items.dao;

import org.example.spring.daos.postgres.items.table.po.TCheckItem;
import org.example.spring.daos.postgres.items.table.query.TCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TCheckItemDao extends TkBaseDao<TCheckItem, TCheckItemQuery> {
    boolean deleteByFeeItemIds(List<Long> ids);

    boolean deleteByFeeItemIds(Long... ids);

    boolean deleteByFeeItemId(Long id);
}
