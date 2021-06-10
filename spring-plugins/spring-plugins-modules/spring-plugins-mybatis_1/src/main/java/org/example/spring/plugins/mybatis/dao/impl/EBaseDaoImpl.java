package org.example.spring.plugins.mybatis.dao.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.entity.query.OrderTypeEnum;
import org.example.spring.plugins.mybatis.dao.EBaseDao;
import org.example.spring.plugins.mybatis.entity.query.EBaseQuery;
import org.example.spring.plugins.mybatis.entity.result.IPageResult;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author yuane
 */
@SuppressWarnings("unchecked")
public abstract class EBaseDaoImpl<T, Q extends EBaseQuery<E>, E, M extends IBaseMapper<T>> extends IBaseDaoImpl<T, Q, M> implements EBaseDao<T, Q, E> {
    @Override
    protected Class<T> currentMapperClass() {
        return (Class<T>) ReflectionKit.getSuperClassGenericType(getClass(), 3);
    }

    @Override
    protected Class<T> currentModelClass() {
        return (Class<T>) ReflectionKit.getSuperClassGenericType(getClass(), 0);
    }

    @Override
    public Optional<T> getByIdOpt(Long id) {
        return Optional.ofNullable(getById(id));
    }

    @Override
    public List<T> listByIds(Long... ids) {
        return listByIds(Arrays.asList(ids));
    }

    @Override
    public Stream<T> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<T> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
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
    public List<T> selectList(Q query) {
        return queryList(query);
    }

    @Override
    public List<T> searchList(Q query) {
        return queryList(query);
    }

    @Override
    public List<T> findList(Q query) {
        return queryList(query);
    }

    @Override
    public Stream<T> queryListStream(Q query) {
        return queryList(query).stream();
    }

    @Override
    public Stream<T> selectListStream(Q query) {
        return queryListStream(query);
    }

    @Override
    public Stream<T> searchListStream(Q query) {
        return queryListStream(query);
    }

    @Override
    public Stream<T> findListStream(Q query) {
        return queryListStream(query);
    }

    @Override
    public Stream<T> queryTopStream(Q query) {
        return queryTop(query).stream();
    }

    @Override
    public Stream<T> selectTopStream(Q query) {
        return queryTopStream(query);
    }

    @Override
    public Stream<T> searchTopStream(Q query) {
        return queryTopStream(query);
    }

    @Override
    public Stream<T> findTopStream(Q query) {
        return findTopStream(query);
    }

    @Override
    public IPageData<T> queryPage(Q query) {
        Wrapper<T> wrapper = queryWrapper(query);
        if (wrapper == null || wrapper.equals(Wrappers.emptyWrapper())) {
            PageHelper.startPage(query.getPage(), query.getSize());
            E example = query.toExample();
            example = exampleAddOrder(query, example);
            return pageData(PageInfo.of(baseMapper.selectByExample(example)));
        } else {
            PageHelper.startPage(query.getPage(), query.getSize());
            wrapper = wrapperAddOrder(query, wrapper);
            return pageData(PageInfo.of(list(wrapper)));
        }
    }

    @Override
    public IPageData<T> selectPage(Q query) {
        return queryPage(query);
    }

    @Override
    public IPageData<T> searchPage(Q query) {
        return queryPage(query);
    }

    @Override
    public IPageData<T> findPage(Q query) {
        return queryPage(query);
    }

    @Override
    public List<T> queryTop(Q query) {
        return queryPage((Q) query.withPage(1)).getData();
    }

    @Override
    public List<T> selectTop(Q query) {
        return queryTop(query);
    }

    @Override
    public List<T> searchTop(Q query) {
        return queryTop(query);
    }

    @Override
    public List<T> findTop(Q query) {
        return queryTop(query);
    }

    @Override
    public Optional<T> queryFirstOpt(Q query) {
        return queryTop((Q) query.withPage(1).withSize(1)).stream().findFirst();
    }

    @Override
    public Optional<T> selectFirstOpt(Q query) {
        return queryFirstOpt(query);
    }

    @Override
    public Optional<T> searchFirstOpt(Q query) {
        return queryFirstOpt(query);
    }

    @Override
    public Optional<T> findFirstOpt(Q query) {
        return queryFirstOpt(query);
    }

    @Override
    public T queryFirst(Q query) {
        return queryFirstOpt(query).orElse(null);
    }

    @Override
    public T selectFirst(Q query) {
        return queryFirst(query);
    }

    @Override
    public T searchFirst(Q query) {
        return queryFirst(query);
    }

    @Override
    public T findFirst(Q query) {
        return queryFirst(query);
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
    public T selectOne(Q query) {
        return queryOne(query);
    }

    @Override
    public T searchOne(Q query) {
        return queryOne(query);
    }

    @Override
    public T findOne(Q query) {
        return queryOne(query);
    }

    @Override
    public Optional<T> queryOneOpt(Q query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public Optional<T> selectOneOpt(Q query) {
        return queryOneOpt(query);
    }

    @Override
    public Optional<T> searchOneOpt(Q query) {
        return queryOneOpt(query);
    }

    @Override
    public Optional<T> findOneOpt(Q query) {
        return queryOneOpt(query);
    }

    @Override
    public boolean modifyById(T t) {
        return updateById(t);
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
    public boolean modify(T t) {
        return update(t);
    }

    @Override
    public boolean updateNull(T t) {
        return SqlHelper.retBool(baseMapper.updateByPrimaryKey(t));
    }

    @Override
    public boolean modifyNull(T t) {
        return updateNull(t);
    }

    @Override
    public boolean updateSelective(T t) {
        return SqlHelper.retBool(baseMapper.updateByPrimaryKeySelective(t));
    }

    @Override
    public boolean modifySelective(T t) {
        return updateSelective(t);
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
    public boolean updateBatchById(List<T> list) {
        return SqlHelper.retBool(baseMapper.updateBatchById(list));
    }

    @Override
    public boolean modifyBatchById(List<T> list) {
        return updateBatchById(list);
    }

    @Override
    public boolean updateNotNullColumnsBatchById(List<T> listForUpdate) {
        return SqlHelper.retBool(baseMapper.updateNotNullColumnsBatchById(listForUpdate));
    }

    @Override
    public boolean modifyNotNullColumnsBatchById(List<T> listForUpdate) {
        return updateNotNullColumnsBatchById(listForUpdate);
    }

    @Override
    public boolean updateSetColumnsBatchById(List<T> list) {
        return SqlHelper.retBool(baseMapper.updateSetColumnsBatchById(list));
    }

    @Override
    public boolean modifySetColumnsBatchById(List<T> list) {
        return updateSetColumnsBatchById(list);
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
    public boolean insertBatch(List<T> list) {
        return SqlHelper.retBool(baseMapper.insertBatch(list));
    }

    @Override
    public boolean updateBatchSelective(List<T> list) {
        return SqlHelper.retBool(list.stream().map(baseMapper::updateByPrimaryKeySelective).reduce(Integer::sum).orElse(0));
    }

    @Override
    public boolean updateBatchNull(List<T> list) {
        return SqlHelper.retBool(list.stream().map(baseMapper::updateByPrimaryKey).reduce(Integer::sum).orElse(0));
    }

    @Override
    public boolean saveSelective(T t) {
        return insertSelective(t);
    }

    @Override
    public boolean saveSelective(List<T> list) {
        return SqlHelper.retBool(list.stream().map(baseMapper::insertSelective).reduce(Integer::sum).orElse(0));
    }

    @Override
    public boolean insertSelective(T t) {
        return SqlHelper.retBool(baseMapper.insertSelective(t));
    }

    @Override
    public boolean insertSelective(List<T> t) {
        return SqlHelper.retBool(t.stream().map(baseMapper::insertSelective).reduce(Integer::sum).orElse(0));
    }

    @Override
    public boolean insert(T t) {
        return save(t);
    }

    @Override
    public boolean insert(List<T> t) {
        return SqlHelper.retBool(t.stream().map(baseMapper::insert).reduce(Integer::sum).orElse(0));
    }

    @Override
    public boolean remove(Q q) {
        return SqlHelper.retBool(baseMapper.deleteByExample(q.toExample()));
    }

    @Override
    public boolean delete(Q q) {
        return remove(q);
    }

    @Override
    public boolean remove(Example example) {
        return SqlHelper.retBool(baseMapper.deleteByExample(example));
    }

    @Override
    public boolean delete(Example example) {
        return remove(example);
    }

    @Override
    public boolean deleteByMap(Map<String, Object> map) {
        return removeByMap(map);
    }

    @Override
    public boolean deleteById(Serializable id) {
        return removeById(id);
    }

    @Override
    public boolean deleteByIds(Collection<? extends Serializable> ids) {
        return removeByIds(ids);
    }

    @Override
    public boolean removeByIds(Serializable... ids) {
        return removeByIds(Arrays.asList(ids));
    }

    @Override
    public boolean deleteByIds(Serializable... ids) {
        return deleteByIds(Arrays.asList(ids));
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