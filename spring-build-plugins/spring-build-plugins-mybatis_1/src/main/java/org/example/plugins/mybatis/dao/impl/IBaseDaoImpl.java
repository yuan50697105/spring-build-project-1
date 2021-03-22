package org.example.plugins.mybatis.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import org.example.plugins.mybatis.dao.IBaseDao;
import org.example.plugins.mybatis.entity.po.IBaseEntity;
import org.example.plugins.mybatis.mapper.IBaseMapper;

/**
 * @author yuane
 */
public abstract class IBaseDaoImpl<T extends IBaseEntity, Q extends MybatisExample<E>, E, M extends IBaseMapper<T>> extends ServiceImpl<M, T> implements IBaseDao<T, Q, E> {
}