package org.example.spring.plugins.mybatis.dao.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import org.example.spring.plugins.commons.entity.query.OrderTypeEnum;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import tk.mybatis.mapper.entity.Example;

public abstract class TkBaseDaoImpl<T, Q extends TkBaseQuery<T>, M extends IBaseMapper<T>> extends EBaseDaoImpl<T, Q, Example, M> implements TkBaseDao<T, Q> {

    @SuppressWarnings("unchecked")
    @Override
    protected Class<M> currentMapperClass() {
        return (Class<M>) ReflectionKit.getSuperClassGenericType(getClass(), TkBaseDaoImpl.class, 2);
    }

    protected Example.Builder exampleBuilder() {
        return Example.builder(entityClass);
    }

    @Override
    public boolean removeByExample(Example example) {
        return SqlHelper.retBool(baseMapper.deleteByExample(example));
    }

    @Override
    public boolean deleteByExample(Example example) {
        return SqlHelper.retBool(baseMapper.deleteByExample(example));
    }


    @Override
    public boolean update(T t, Example example) {
        return SqlHelper.retBool(baseMapper.updateByExample(t, example));
    }

    @Override
    public boolean updateSelective(T t, Example example) {
        return SqlHelper.retBool(baseMapper.updateByExampleSelective(t, example));
    }

    @Override
    protected Example exampleAddOrder(Q query, Example example) {
        example = super.exampleAddOrder(query, example);
        String order = query.getOrder();
        order = StrUtil.toUnderlineCase(order);
        OrderTypeEnum orderType = query.getOrderType();
        if (orderType.equals(OrderTypeEnum.desc)) {
            example.setOrderByClause(order + " desc");
        } else {
            example.setOrderByClause(order + " asc");
        }
        return example;
    }
}