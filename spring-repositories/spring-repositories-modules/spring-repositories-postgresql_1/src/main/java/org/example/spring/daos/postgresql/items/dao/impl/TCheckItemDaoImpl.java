package org.example.spring.daos.postgresql.items.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.postgresql.items.dao.TCheckItemDao;
import org.example.spring.daos.postgresql.items.mapper.TCheckItemMapper;
import org.example.spring.daos.postgresql.items.table.po.TCheckItem;
import org.example.spring.daos.postgresql.items.table.query.TCheckItemQuery;
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