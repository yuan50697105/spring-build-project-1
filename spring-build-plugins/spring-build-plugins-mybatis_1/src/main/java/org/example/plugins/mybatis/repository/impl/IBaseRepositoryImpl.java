package org.example.plugins.mybatis.repository.impl;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import org.example.plugins.mybatis.dao.IBaseDao;
import org.example.plugins.mybatis.mapper.IBaseMapper;
import org.example.plugins.mybatis.repository.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yuane
 */
@SuppressWarnings({"SpringJavaAutowiredMembersInspection", "unused"})
public abstract class IBaseRepositoryImpl<T, Q extends MybatisExample<E>, E, D extends IBaseDao<T, Q, E>, M extends IBaseMapper<T>> implements IBaseRepository<T, Q, E> {
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