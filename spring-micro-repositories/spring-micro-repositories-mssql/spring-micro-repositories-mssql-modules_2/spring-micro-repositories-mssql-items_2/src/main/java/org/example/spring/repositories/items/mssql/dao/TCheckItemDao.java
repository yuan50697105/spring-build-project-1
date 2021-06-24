package org.example.spring.repositories.items.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.items.mssql.table.po.TCheckItem;
import org.example.spring.repositories.items.mssql.table.query.TCheckItemQuery;

import java.util.List;

public interface TCheckItemDao extends TkBaseDao<TCheckItem, TCheckItemQuery> {
    boolean deleteByFeeItemIds(List<Long> ids);

    boolean deleteByFeeItemIds(Long... ids);

    boolean deleteByFeeItemId(Long id);
}
