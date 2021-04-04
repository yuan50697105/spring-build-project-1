package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.dao.TCustomerGroupDao;
import org.example.modules.repository.mysql.table.po.TCustomerGroup;
import org.example.modules.repository.mysql.entity.query.TCustomerGroupQuery;
import org.example.modules.repository.mysql.mapper.TCustomerGroupMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@AllArgsConstructor
@Transactional
public class TCustomerGroupDaoImpl extends TkBaseDaoImpl<TCustomerGroup, TCustomerGroupQuery, TCustomerGroupMapper> implements TCustomerGroupDao {
    @Override
    protected Wrapper<TCustomerGroup> queryWrapper(TCustomerGroupQuery tCustomerGroupQuery) {
        return null;
    }
}