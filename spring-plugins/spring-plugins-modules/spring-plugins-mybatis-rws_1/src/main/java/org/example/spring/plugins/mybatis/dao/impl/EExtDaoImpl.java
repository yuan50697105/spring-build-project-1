package org.example.spring.plugins.mybatis.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.spring.plugins.mybatis.dao.EExtDao;
import org.example.spring.plugins.mybatis.entity.query.EExtQuery;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

public abstract class EExtDaoImpl<T, Q extends EExtQuery<E>, E, M extends IBaseMapper<T>> extends EBaseDaoImpl<T, Q, E, M> implements EExtDao<T, Q, E> {
    @Override
    protected Wrapper<T> queryWrapper(Q q) {
        return q.wrapper();
    }
}