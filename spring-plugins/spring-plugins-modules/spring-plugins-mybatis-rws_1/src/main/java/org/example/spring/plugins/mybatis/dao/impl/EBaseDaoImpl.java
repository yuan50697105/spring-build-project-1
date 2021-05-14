package org.example.spring.plugins.mybatis.dao.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.entity.query.OrderTypeEnum;
import org.example.spring.plugins.mybatis.dao.EBaseDao;
import org.example.spring.plugins.mybatis.entity.query.EBaseQuery;
import org.example.spring.plugins.mybatis.entity.result.IPageResult;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.springframework.scheduling.annotation.Async;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

/**
 * @author yuane
 */
@SuppressWarnings("unchecked")
public abstract class EBaseDaoImpl<T, Q extends EBaseQuery<E>, E, M extends IBaseMapper<T>> extends ServiceImpl<M, T> implements EBaseDao<T, Q, E> {
    @Override
    public Optional<T> getByIdOpt(Long id) {
        return Optional.ofNullable(getById(id));
    }

    @Override
    protected Class<T> currentMapperClass() {
        return (Class<T>) ReflectionKit.getSuperClassGenericType(getClass(), 3);
    }

    @Override
    protected Class<T> currentModelClass() {
        return (Class<T>) ReflectionKit.getSuperClassGenericType(getClass(), 0);
    }

    @Override
    @Async
    public CompletableFuture<Optional<T>> getByIdOptAsync(Long id) {
        return CompletableFuture.completedFuture(getByIdOpt(id));
    }

    @Override
    public List<T> queryList(Q query) {
        Wrapper<T> wrapper = queryWrapper(query);
        if (wrapper == null || wrapper.equals(Wrappers.emptyWrapper())) {
            E example = query.toExample();
            example = exampleAddOrder(query, example);
            return baseMapper.selectByExample(example);
        } else {
            wrapper = wrapperAddOrder(query, wrapper);
            return list(wrapper);
        }
    }

    @Override
    public Stream<T> queryListStream(Q query) {
        return queryList(query).stream();
    }

    @Override
    public Stream<T> queryTopStream(Q query) {
        return queryTop(query).stream();
    }

    @Override
    public IPageData<T> queryPage(Q query) {
        Wrapper<T> wrapper = queryWrapper(query);
        if (wrapper == null || wrapper.equals(Wrappers.emptyWrapper())) {
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
    @Deprecated
    public List<T> queryTop(Q query, Integer size) {
        return queryTop((Q) query.withSize(size));
    }

    @Override
    public List<T> queryTop(Q query) {

        return queryPage((Q) query.withPage(1)).getData();
    }

    @Override
    public Optional<T> queryFirst(Q query) {
        return queryTop((Q) query.withPage(1).withSize(1)).stream().findFirst();
    }


    @Override
    public T queryOne(Q query) {
        Wrapper<T> wrapper = queryWrapper(query);
        if (wrapper == null || wrapper.equals(Wrappers.emptyWrapper())) {
            PageHelper.startPage(query.getPage(), query.getSize());
            E example = query.toExample();
            return baseMapper.selectOneByExample(example);
        } else {
            return getOne(wrapper);
        }
    }

    @Override
    public Optional<T> queryOneOpt(Q query) {
        return Optional.ofNullable(queryOne(query));
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

    @Override
    public boolean update(T t) {
        return SqlHelper.retBool(baseMapper.updateByPrimaryKey(t));
    }

    @Override
    public boolean updateSelective(T t) {
        return SqlHelper.retBool(baseMapper.updateByPrimaryKeySelective(t));
    }

    @Override
    public boolean update(T t, Q q) {
        return SqlHelper.retBool(baseMapper.updateByExample(t, q.toExample()));
    }

    @Override
    public boolean updateSelective(T t, Q q) {
        return SqlHelper.retBool(baseMapper.updateByExampleSelective(t, q.toExample()));
    }

    @Override
    public boolean updateNotNullColumnsBatchById(List<T> listForUpdate) {
        return SqlHelper.retBool(baseMapper.updateNotNullColumnsBatchById(listForUpdate));
    }

    @Override
    public boolean updateSetColumnsBatchById(List<T> list) {
        return SqlHelper.retBool(baseMapper.updateSetColumnsBatchById(list));
    }

    @Override
    public boolean insertSetColumnsBatch(List<T> list) {
        return SqlHelper.retBool(baseMapper.insertSetColumnsBatch(list));
    }

    @Override
    public boolean insertNotNullColumnsBatch(List<T> list) {
        return SqlHelper.retBool(baseMapper.insertNotNullColumnsBatch(list));
    }

    @Override
    public boolean insertSelective(T t) {
        return SqlHelper.retBool(baseMapper.insertSelective(t));
    }

    @Override
    public boolean insert(T t) {
        return save(t);
    }

    @Override
    public boolean remove(Q q) {
        return SqlHelper.retBool(baseMapper.deleteByExample(q.toExample()));
    }

    @Override
    public boolean deleteByMap(Map<String, Object> map) {
        return removeByMap(map);
    }

    @Override
    public boolean delete(Q q) {
        return remove(q);
    }

    @Override
    public boolean deleteById(Serializable id) {
        return removeById(id);
    }

    @Override
    public boolean deleteByIds(Collection<? extends Serializable> ids) {
        return removeByIds(ids);
    }

    public boolean isNotEmpty(Object object) {
        return ObjectUtil.isNotEmpty(object);
    }

    protected abstract Wrapper<T> queryWrapper(Q q);

    protected IPageData<T> pageData(PageInfo<T> pageInfo) {
        return new IPageResult<>(pageInfo);
    }

    protected IPageData<T> pageData(IPage<T> iPage) {
        return new IPageResult<>(iPage);
    }
}