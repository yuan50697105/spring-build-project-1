package org.example.spring.plugins.mybatis.dao;

import org.example.spring.plugins.mybatis.entity.query.EBaseQuery;

/**
 * @author yuane
 */
public interface EBaseDao<T, Q extends EBaseQuery<E>, E> extends IBaseDao<T, Q> {


}
