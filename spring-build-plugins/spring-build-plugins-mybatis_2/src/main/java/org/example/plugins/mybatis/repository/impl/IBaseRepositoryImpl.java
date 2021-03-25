package org.example.plugins.mybatis.repository.impl;

import org.example.plugins.mybatis.entity.query.EBaseQuery;
import org.example.plugins.mybatis.entity.query.IBaseQuery;
import org.example.plugins.mybatis.repository.IBaseRepository;

/**
 * @author yuane
 */
@SuppressWarnings({"SpringJavaAutowiredMembersInspection", "unused"})
public abstract class IBaseRepositoryImpl<T, V, D, Q extends IBaseQuery> implements IBaseRepository<T, V, D, Q> {

}