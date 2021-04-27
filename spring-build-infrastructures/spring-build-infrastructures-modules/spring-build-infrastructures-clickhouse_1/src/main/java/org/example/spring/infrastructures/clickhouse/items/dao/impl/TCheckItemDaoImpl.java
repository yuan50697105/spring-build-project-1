package org.example.spring.infrastructures.clickhouse.items.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.clickhouse.items.dao.TCheckItemDao;
import org.example.spring.infrastructures.clickhouse.items.mapper.TCheckItemMapper;
import org.example.spring.infrastructures.clickhouse.items.table.po.TCheckItem;
import org.example.spring.infrastructures.clickhouse.items.table.query.TCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TCheckItemDaoImpl extends TkBaseDaoImpl<TCheckItem, TCheckItemQuery, TCheckItemMapper> implements TCheckItemDao {
    @Override
    protected Wrapper<TCheckItem> queryWrapper(TCheckItemQuery tCheckItemQuery) {
        return null;
    }
}