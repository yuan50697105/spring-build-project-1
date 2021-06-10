package org.example.spring.plugins.mybatis.dao;

import org.example.spring.plugins.mybatis.entity.query.EBaseQuery;

import java.util.List;

/**
 * @author yuane
 */
public interface EBaseDao<T, Q extends EBaseQuery<E>, E> extends IBaseDao<T,Q> {

    boolean insertSelective(List<T> t);

    boolean insert(List<T> t);
}
