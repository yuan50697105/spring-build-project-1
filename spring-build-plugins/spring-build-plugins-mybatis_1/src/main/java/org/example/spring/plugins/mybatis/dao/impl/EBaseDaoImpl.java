package org.example.spring.plugins.mybatis.dao.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.spring.plugins.commons.entity.query.OrderTypeEnum;
import org.example.spring.plugins.mybatis.dao.EBaseDao;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.mybatis.entity.query.EBaseQuery;
import org.example.spring.plugins.mybatis.entity.result.IPageResult;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

import java.util.List;
import java.util.Optional;

/**
 * @author yuane
 */
public abstract class EBaseDaoImpl<T, Q extends EBaseQuery<E>, E, M extends IBaseMapper<T>> extends ServiceImpl<M, T> implements EBaseDao<T, Q, E> {
    @Override
    public Optional<T> getByIdOpt(Long id) {
        return Optional.ofNullable(getById(id));
    }

    @Override
    public List<T> queryList(Q query) {
        Wrapper<T> wrapper = queryWrapper(query);
        if (wrapper == null) {
            E example = query.toExample();
            example = exampleAddOrder(query, example);
            return baseMapper.selectByExample(example);
        } else {
            wrapper = wrapperAddOrder(query, wrapper);
            return list(wrapper);
        }
    }

    @Override
    public IPageData<T> queryPage(Q query) {
        Wrapper<T> wrapper = queryWrapper(query);
        if (wrapper == null) {
            PageHelper.startPage(query.getPage(), query.getSize());
            E example = query.toExample();
            example = exampleAddOrder(query, example);
            return new IPageResult<>(PageInfo.of(baseMapper.selectByExample(example)));
        } else {
            PageHelper.startPage(query.getPage(), query.getSize());
            wrapper = wrapperAddOrder(query, wrapper);
            return new IPageResult<>(PageInfo.of(list(wrapper)));
        }
    }

    @Override
    public List<T> queryTop(Q query, Integer size) {
        Wrapper<T> wrapper = queryWrapper(query);
        if (wrapper == null) {
            PageHelper.startPage(1, size);
            E example = query.toExample();
            example = exampleAddOrder(query, example);
            return baseMapper.selectByExample(example);
        } else {
            PageHelper.startPage(query.getPage(), query.getSize());
            wrapper = wrapperAddOrder(query, wrapper);
            return PageInfo.of(list(wrapper)).getList();
        }
    }

    @Override
    public Optional<T> queryFirst(Q query) {
        return queryTop(query, 1).stream().findFirst();
    }


    @Override
    public T queryOne(Q query) {
        Wrapper<T> wrapper = queryWrapper(query);
        if (wrapper == null) {
            PageHelper.startPage(query.getPage(), query.getSize());
            E example = query.toExample();
            return baseMapper.selectOneByExample(example);
        } else {
            return getOne(wrapper);
        }
    }

    @Override
    public Optional<T> queryOneOpt(Q query) {
        Wrapper<T> wrapper = queryWrapper(query);
        if (wrapper == null) {
            PageHelper.startPage(query.getPage(), query.getSize());
            E example = query.toExample();
            return Optional.ofNullable(baseMapper.selectOneByExample(example));
        } else {
            return Optional.ofNullable(getOne(wrapper));
        }
    }

    protected E exampleAddOrder(Q query, E example) {
        query.addDefault();
        return example;
    }

    protected Wrapper<T> wrapperAddOrder(Q query, Wrapper<T> wrapper) {
        if (wrapper instanceof QueryWrapper) {
            QueryWrapper<T> queryWrapper = (QueryWrapper<T>) wrapper;
            String order = query.getOrder();
            order = StrUtil.toUnderlineCase(order);
            OrderTypeEnum orderType = query.getOrderType();
            if (orderType.equals(OrderTypeEnum.desc)) {
                queryWrapper.orderByDesc(order);
            } else {
                queryWrapper.orderByAsc(order);
            }
            return queryWrapper;
        } else {
            return wrapper;
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean updateAllById(T t) {
        return retBool(baseMapper.updateByPrimaryKey(t));
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean updateSelectiveById(T t) {
        return retBool(baseMapper.updateByPrimaryKeySelective(t));
    }

    @Override
    public boolean updateNotNullColumnsBatchById(List<T> listForUpdate) {
        return retBool(baseMapper.updateNotNullColumnsBatchById(listForUpdate));
    }

    @Override
    public boolean updateSetColumnsBatchById(List<T> list) {
        return retBool(baseMapper.updateSetColumnsBatchById(list));
    }

    @Override
    public boolean insertNotNullColumnsBatch(List<T> list) {
        return retBool(baseMapper.insertNotNullColumnsBatch(list));
    }

    @Override
    public boolean insertSetColumnsBatch(List<T> list) {
        return retBool(baseMapper.insertSetColumnsBatch(list));
    }

    public boolean isNotEmpty(Object object) {
        return ObjectUtil.isNotEmpty(object);
    }

    protected abstract Wrapper<T> queryWrapper(Q q);

    protected <T> IPageData<T> pageData(PageInfo<T> pageInfo) {
        return new IPageResult<>(pageInfo);
    }

    protected <T> IPageData<T> pageData(IPage<T> iPage) {
        return new IPageResult<>(iPage);
    }
}