package org.example.spring.plugins.mybatis.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.spring.plugins.mybatis.dao.TkExtDao;
import org.example.spring.plugins.mybatis.entity.query.TkExtQuery;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

public class TkExtDaoImpl<T, Q extends TkExtQuery<T>, M extends IBaseMapper<T>> extends TkBaseDaoImpl<T, Q, M> implements TkExtDao<T, Q> {
    @Override
    protected Wrapper<T> queryWrapper(Q q) {
        return q.wrapper();
    }
}