package org.example.spring.plugins.mybatis.repository.impl;

import org.example.spring.plugins.commons.entity.query.BaseQuery;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

/**
 * @author yuane
 */
@SuppressWarnings({"SpringJavaAutowiredMembersInspection", "unused"})
public abstract class IBaseRepositoryImpl<T, V, D, Q extends BaseQuery> implements IBaseRepository<T, V, D, Q> {

}