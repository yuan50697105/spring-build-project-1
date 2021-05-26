package org.example.spring.plugins.mybatis.dao;

import org.example.spring.plugins.mybatis.entity.query.TkExtQuery;

public interface TkExtDao<T, Q extends TkExtQuery<T>> extends TkBaseDao<T, Q> {
}
