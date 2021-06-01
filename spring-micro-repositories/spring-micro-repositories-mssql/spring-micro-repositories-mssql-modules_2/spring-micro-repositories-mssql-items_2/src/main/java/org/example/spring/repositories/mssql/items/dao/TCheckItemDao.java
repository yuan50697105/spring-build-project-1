package org.example.spring.repositories.mssql.items.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mssql.items.table.po.TCheckItem;
import org.example.spring.repositories.mssql.items.table.query.TCheckItemQuery;

import java.util.List;

public interface TCheckItemDao extends TkBaseDao<TCheckItem, TCheckItemQuery> {
    boolean deleteByFeeItemIds(List<Long> ids);

    boolean deleteByFeeItemIds(Long... ids);

    boolean deleteByFeeItemId(Long id);
}
