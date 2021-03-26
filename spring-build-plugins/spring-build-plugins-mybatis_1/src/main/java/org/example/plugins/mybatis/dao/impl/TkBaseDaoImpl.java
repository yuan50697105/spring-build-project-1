package org.example.plugins.mybatis.dao.impl;

import cn.hutool.core.util.StrUtil;
import org.example.plugins.commons.entity.query.BaseQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;
import org.example.plugins.mybatis.entity.OrderTypeEnum;
import org.example.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.plugins.mybatis.mapper.IBaseMapper;
import tk.mybatis.mapper.entity.Example;

public abstract class TkBaseDaoImpl<T, Q extends TkBaseQuery<T>, M extends IBaseMapper<T>> extends EBaseDaoImpl<T, Q, Example, M> implements TkBaseDao<T, Q> {
    @Override
    protected Example exampleAddOrder(Q query, Example example) {
        example = super.exampleAddOrder(query, example);
        String order = query.getOrder();
        order = StrUtil.toUnderlineCase(order);
        BaseQuery.OrderTypeEnum orderType = query.getOrderType();
        if (orderType.equals(OrderTypeEnum.DESC)) {
            example.setOrderByClause(order + " desc");
        } else {
            example.setOrderByClause(order + " asc");
        }
        return example;
    }
}