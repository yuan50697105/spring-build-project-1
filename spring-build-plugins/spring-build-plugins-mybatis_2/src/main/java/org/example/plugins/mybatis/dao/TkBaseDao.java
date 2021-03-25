package org.example.plugins.mybatis.dao;

import org.example.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

public interface TkBaseDao<T, Q extends TkBaseQuery<T>> extends EBaseDao<T, Q, Example> {
}
