package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.dao.TCustomerGroupItemDao;
import org.example.modules.repository.mysql.mapper.TCustomerGroupItemMapper;
import org.example.modules.repository.mysql.table.po.TCustomerGroupItem;
import org.example.modules.repository.mysql.table.query.TCustomerGroupItemQuery;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
@AllArgsConstructor
public class TCustomerGroupItemDaoImpl extends TkBaseDaoImpl<TCustomerGroupItem, TCustomerGroupItemQuery, TCustomerGroupItemMapper> implements TCustomerGroupItemDao {
    @Override
    protected Wrapper<TCustomerGroupItem> queryWrapper(TCustomerGroupItemQuery tCustomerGroupItemQuery) {
        return null;
    }
}