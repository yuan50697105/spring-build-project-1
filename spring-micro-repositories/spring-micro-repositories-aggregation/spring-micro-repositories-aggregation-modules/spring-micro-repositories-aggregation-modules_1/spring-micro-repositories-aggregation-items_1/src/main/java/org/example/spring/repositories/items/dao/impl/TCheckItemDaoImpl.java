package org.example.spring.repositories.items.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.items.dao.TCheckItemDao;
import org.example.spring.repositories.items.mapper.TCheckItemMapper;
import org.example.spring.repositories.items.table.po.TCheckItem;
import org.example.spring.repositories.items.table.query.TCheckItemQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.weekend.WeekendSqls;

import java.util.Arrays;
import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class TCheckItemDaoImpl extends TkBaseDaoImpl<TCheckItem, TCheckItemQuery, TCheckItemMapper> implements TCheckItemDao {
    @Override
    protected Wrapper<TCheckItem> queryWrapper(TCheckItemQuery tCheckItemQuery) {
        return null;
    }

    @Override
    public boolean deleteByFeeItemIds(List<Long> ids) {
        return deleteByExample(exampleBuilder().where(WeekendSqls.<TCheckItem>custom().andIn(TCheckItem::getFeeItemId, ids)).build());
    }

    @Override
    public boolean deleteByFeeItemIds(Long... ids) {
        return deleteByFeeItemIds(Arrays.asList(ids));
    }

    @Override
    public boolean deleteByFeeItemId(Long id) {
        return deleteByExample(exampleBuilder().where(WeekendSqls.<TCheckItem>custom().andEqualTo(TCheckItem::getFeeItemId, id)).build());
    }
}