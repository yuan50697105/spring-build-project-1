package org.example.plugins.mybatis.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.plugins.mybatis.dao.IBaseDao;
import org.example.plugins.mybatis.mapper.IBaseMapper;

/**
 * @author yuane
 */
public abstract class IBaseDaoImpl<T,M extends IBaseMapper<T>> extends ServiceImpl<M,T> implements IBaseDao<T> {
}