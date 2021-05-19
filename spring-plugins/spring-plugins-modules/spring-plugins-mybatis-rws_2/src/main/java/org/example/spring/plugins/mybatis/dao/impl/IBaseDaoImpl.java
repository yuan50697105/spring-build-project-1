package org.example.spring.plugins.mybatis.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.spring.plugins.mybatis.dao.IBaseDao;
import org.example.spring.plugins.mybatis.entity.query.IBaseQuery;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class IBaseDaoImpl<T, Q extends IBaseQuery, M extends IBaseMapper<T>> extends ServiceImpl<M, T> implements IBaseDao<T, Q> {
}