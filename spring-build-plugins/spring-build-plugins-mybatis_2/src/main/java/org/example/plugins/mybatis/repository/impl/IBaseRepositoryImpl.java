package org.example.plugins.mybatis.repository.impl;

import org.example.plugins.mybatis.dao.IBaseDao;
import org.example.plugins.mybatis.mapper.IBaseMapper;
import org.example.plugins.mybatis.repository.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yuane
 */
@SuppressWarnings({"SpringJavaAutowiredMembersInspection", "unused"})
public abstract class IBaseRepositoryImpl<T, D extends IBaseDao<T>, M extends IBaseMapper<T>> implements IBaseRepository<T> {
    @Autowired
    protected D baseDao;
    @Autowired
    protected M baseMapper;

    public D baseDao() {
        return baseDao;
    }

    public M baseMapper() {
        return baseMapper;
    }
}