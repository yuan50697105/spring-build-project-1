package org.example.spring.plugins.mybatis.dao;

import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

public interface TkBaseDao<T, Q extends TkBaseQuery<T>> extends EBaseDao<T, Q, Example> {
    boolean removeByExample(Example example);

    boolean deleteByExample(Example example);
}
