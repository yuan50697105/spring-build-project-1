package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.dao.TOrderItemDao;
import org.example.modules.repository.mysql.table.po.TOrderItem;
import org.example.modules.repository.mysql.table.query.TOrderItemQuery;
import org.example.modules.repository.mysql.mapper.TOrderItemMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TOrderItemDaoImpl extends TkBaseDaoImpl<TOrderItem, TOrderItemQuery, TOrderItemMapper> implements TOrderItemDao {
    @Override
    protected Wrapper<TOrderItem> queryWrapper(TOrderItemQuery tOrderItemQuery) {
        return null;
    }
}