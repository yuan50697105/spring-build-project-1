package org.example.plugins.mybatis.repository.impl;

import org.example.plugins.mybatis.entity.query.EBaseQuery;
import org.example.plugins.mybatis.repository.IBaseRepository;

/**
 * @author yuane
 */
@SuppressWarnings({"SpringJavaAutowiredMembersInspection", "unused"})
public abstract class IBaseRepositoryImpl<T, V, D, Q extends EBaseQuery> implements IBaseRepository<T, V, D, Q> {

}